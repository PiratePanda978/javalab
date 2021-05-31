import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Q2 extends HttpServlet {
    private String message;
    public void init() throws ServletException {
        message = "My name is Anupam Kunwar and my registration number is 19BCE1369";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }
    public void destroy() {
    }
}