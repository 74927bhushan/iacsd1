package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Course;
import pojos.Student;

/**
 * Servlet implementation class ProcessAdmissionForm
 */
@WebServlet("/process_admission")
public class ProcessAdmissionForm extends HttpServlet {
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
			// 3. Create student pojo using req params
			int score = Integer.parseInt(request.getParameter("score"));
			Course course = Course.valueOf(request.getParameter("course"));
			Student student = new Student(request.getParameter("fn"), request.getParameter("ln"), score, course);
			// validate score
			if (score >= course.getMinScore())
				student.setAdmissionStatus(true);
			//Store student details under request scope
			request.setAttribute("student_details",student);
			pw.print("<h5>from 1st page.....</h5>");
		//	pw.flush();
			//get RD from request
			RequestDispatcher rd=request.getRequestDispatcher("result");
			rd.forward(request, response);
			/*
			 * WC clrs resp buffer
			 * Suspends exec of this ,method.
			 * WC invokes : doPost of the Result page 
			 * Tesult page can genearate dyn resp.
			 * exec control comes back. BUT CAN NOT generate any dyn resp!
			 */
			System.out.println("Control came back.....");
		}
	}

}
