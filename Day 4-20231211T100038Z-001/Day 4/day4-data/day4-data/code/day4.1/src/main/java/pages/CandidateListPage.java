package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidateDaoImpl;
import pojos.Candidate;
import pojos.User;

/**
 * Servlet implementation class CandidateListPage
 */
@WebServlet("/candidate_list")
public class CandidateListPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5> In candidate list page </h5>");
			// retrieve clnt details from the HttpSession
			// 1. Get HS from WC
			HttpSession hs = request.getSession();
			System.out.println("session is new " + hs.isNew());// f
			System.out.println("session id " + hs.getId());// SAME

			// 2. Fetch user details from HttpSession
			User userDetail = (User) hs.getAttribute("user_info");
			if (userDetail != null) {
				// get candidate dao from session scope
				CandidateDaoImpl dao = (CandidateDaoImpl) hs.getAttribute("candidate_dao");
				// get list of candidates
				List<Candidate> candidates = dao.getAllCandidates();
				// send voter details to the clnt
				pw.print("<h5> Hello , " + userDetail.getFirstName() + " " + userDetail.getLastName() + "</h5>");
				// dyn form generation
				pw.print("<form action='logout' method='post'>");
				for (Candidate c : candidates)
					pw.print("<h5><input type='radio' name='candidate_id' value='" + c.getCandidateId() + "'>"
							+ c.getCandidateName() + "</input></h5>");
				pw.print("<h5><input type='submit' value='Cast A Vote'/></h5>");
				pw.print("</form>");

			} else // => no cookies
				pw.print("<h5> No Cookies , Session Tracking failed!!!!!</h5>");

		} catch (Exception e) {
			// inform WC about the exc
			throw new ServletException("err in do-get of " + getClass(), e);
		}
	}

}
