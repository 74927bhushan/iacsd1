package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidateDaoImpl;
import dao.UserDaoImpl;
import pojos.User;
import static utils.DBUtils.*;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
	private CandidateDaoImpl candidateDao;

	public LoginServlet() {
		System.out.println("in def ctor of " + getClass());
		System.out.println("servlet config " + getServletConfig());// null
	}

	public LoginServlet(String name) {
		System.out.println("in parameterized ctor of " + getClass());
		System.out.println("servlet config " + getServletConfig());// null
	}

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		try {
			ServletConfig config = getServletConfig();
			System.out.println("from init " + config);// not null
			openConnection(config.getInitParameter("db_url"), config.getInitParameter("user_name"),
					config.getInitParameter("password"));
			userDao = new UserDaoImpl();
			candidateDao = new CandidateDaoImpl();
		} catch (Exception e) {
			// centralized err handling in servlets :
			// How to tell WC that init has failed n not to continue
			// with the service phase : simply throw ServletException
			// to the WC
			// ServletException(String mesg,Throwable rootCause)
			throw new ServletException("err in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// clean up dao
			userDao.cleanUp();
			candidateDao.cleanUp();
			closeConnection();
		} catch (Exception e) {
			System.out.println("err in destroy of " + getClass() + " " + e);
			// how to inform the WC ?
			// throw new RuntimeException("err in destroy of "+getClass(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set resp cont type
		response.setContentType("text/html");
		// 2. get PW to send the resp from servlet --> clnt
		try (PrintWriter pw = response.getWriter()) {
			// 3. get req params
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
			// 4 . invoke dao's method for user auth.
			User user = userDao.authenticateUser(email, password);
			if (user == null)
				pw.print("<h5> Invalid Login , Please <a href='login.html'>Retry</a></h5>");
			else {

				// 5. Get HttpSession from WC
				HttpSession session = request.getSession();
				System.out.println("session is new " + session.isNew());// t
				System.out.println("session id " + session.getId());
				// 6. Save validated user details under session scope
				session.setAttribute("user_info", user);
				// 6.5 save dao instances under sesison scope : so that all other dyn web pages
				// can share the same dao instances
				session.setAttribute("user_dao", userDao);
				session.setAttribute("candidate_dao", candidateDao);
				// 7. role based authorization
				if (user.getRole().equals("admin")) // admin user
					response.sendRedirect("admin_page");
				else // voter user
				{
					if (user.isVotingStatus()) // alrdy voted
						response.sendRedirect("logout");
					else // not yet voted
						response.sendRedirect("candidate_list");
					/*
					 * WC sends temp redirect resp SC 302 | Location : candidate_list , Set-cookie :
					 * JSESSIONID : dgdf54653hgdh Body : empty
					 */
				}

			}

		} catch (Exception e) {
			throw new ServletException("err in do-post of " + getClass(), e);
		}
	}

}
