package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidateDaoImpl;
import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class CandidateListPage
 */
@WebServlet("/logout")
public class LogoutPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// Control reaches here , via redirect : in case voter has alrdy voted!
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5> In logout  page </h5>");
			// get HttpSession
			HttpSession session = request.getSession();
			// get user details from session scope
			User user = (User) session.getAttribute("user_info");
			if (user != null) {
				pw.print("<h5> Hello , " + user.getFirstName() + " " + user.getLastName() + "</h5>");
				pw.print("<h5> You have already voted , Can't vote again !!!!!!!!!!");
			} else // => no cookies
				pw.print("<h5> No Cookies , Session Tracking failed!!!!!</h5>");
			// invalidate HttpSession
			session.invalidate();
		}
	}

	// form submission via doPost : after casting a vote
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5> In logout  page </h5>");
			// get HttpSession
			HttpSession session = request.getSession();
			// get user details from session scope
			User user = (User) session.getAttribute("user_info");
			if (user != null) {
				pw.print("<h5> Hello , " + user.getFirstName() + " " + user.getLastName() + "</h5>");
				// get daos from session scope
				UserDaoImpl userDao = (UserDaoImpl) session.getAttribute("user_dao");
				CandidateDaoImpl candidateDao = (CandidateDaoImpl) session.getAttribute("candidate_dao");
				// change voting status
				pw.print("<h5> " + userDao.updateVotingStatus(user.getUserId()) + "</h5>");
				// incr votes
				int candidateId = Integer.parseInt(request.getParameter("candidate_id"));
				// invoke candiadate dao's method to incr votes
				System.out.println(candidateDao.incrementCandidateVotes(candidateId));
			} else // => no cookies
				pw.print("<h5> No Cookies , Session Tracking failed!!!!!</h5>");
			// invalidate HttpSession
			session.invalidate();

		} catch (Exception e) {
			throw new ServletException("err in do-post of " + getClass(), e);
		}

	}

}
