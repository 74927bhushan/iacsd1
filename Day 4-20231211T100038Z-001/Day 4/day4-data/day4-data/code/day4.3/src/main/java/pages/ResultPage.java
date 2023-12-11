package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Student;

/**
 * Servlet implementation class ResultPage
 */
@WebServlet("/result")
public class ResultPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set resp content type : only for checking purpose!!!
		response.setContentType("text/html");
		// 2 PW
		try (PrintWriter pw = response.getWriter()) {
			// get student details from the request scope
			Student s1 = (Student) request.getAttribute("student_details");
			if (s1 != null) {
				pw.print("<h5> Hello , " + s1.getFirstName() + " " + s1.getLastName() + "</h5>");
				if (s1.isAdmissionStatus())
					pw.print("<h5> Congratulations...., You are enrolled in the course " + s1.getSelectedCourse()
							+ "</h5>");
				else
					pw.print("<h5> Sorry !, You can't be enrolled in the course " + s1.getSelectedCourse()
							+ "</h5>");
			} else
				pw.print("<h5> Request Dispatching Failed!!!!!!!!!!!</h5>");
		}
	}

}
