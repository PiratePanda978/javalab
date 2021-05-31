import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

// Extend HttpServlet class
public class Q3 extends HttpServlet {
    static final String DB_URL = "jdbc:mysql://localhost/data3";
    static final String USER = "root";
    static final String PASS = "Anup@mIIO9";
    static final String QUERY = "SELECT acc, mpin FROM AccDetail";
    String acc1;
    String mpin1;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String acc = request.getParameter("acc");
        String mpin = request.getParameter("mpin");
        String type = request.getParameter("type");
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            acc1 = rs.getString("acc");
            mpin1 = rs.getString("mpin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (acc.equals(acc1) && mpin.equals(mpin1)) {
            out.println("<h1> OK </h1>");
        }
        else{
            out.println("<h1>NOT OK </h1>");
        }
    }

    public void destroy(){}
}