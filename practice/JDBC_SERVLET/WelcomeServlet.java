import java.io.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String SName = req.getParameter("name");
        res.getWriter().println("Servlets Welcomes to " + SName);
    }
}