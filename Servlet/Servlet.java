import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdvancedServlet")
public class AdvancedServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Retrieve form parameters
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Perform any advanced processing or validation here

            // Send response to the client
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Advanced Servlet Example</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello, " + username + "!</h2>");
            out.println("<p>Your password is: " + password + "</p>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }
    }
}
