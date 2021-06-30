import java.util.Scanner;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/bankSystem")
public class bankSystem extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public bankSystem() {
        super();
    }
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/bankdb";
    static final String USER = "root";
    static final String PASS = "Anup@mIIO9";
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Scanner sc = new Scanner(System.in);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("database connected");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("statement created");
            stmt = conn.createStatement();
            String acc = req.getParameter("acc");
            int mpin = Integer.parseInt((req.getParameter("mpin")));
            String mode = req.getParameter("mode");
            System.out.println(acc + " " + mpin + " " + mode);
            String sql, sql2;
            String t = Integer.toString(mpin);
            sql = "select * from customeraccount";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println();
            while (rs.next()) {
                String a = rs.getString("accNo");
                int i = rs.getInt("id");
                int m = rs.getInt("mpin");
                System.out.println(i + " " + a + " " + m);
                if (acc.equals(a)) {
                    System.out.println("found");
                    if (mode.equals("deposit")) {
                        System.out.println("deposit found");
                        System.out.print("Enter deposit amount ");
                        int dep = sc.nextInt();
                        sql2 = "UPDATE customeraccount set currBalance=currBalance+'{dep}' WHERE id='{i}'";
                        int rows = stmt.executeUpdate(sql2);
                        System.out.println("Rows impacted : " + rows);
                        out.println("Deposit amount is " + dep);
                    } else if (mode.equals("withdraw")) {
                        System.out.print("Enter withdraw amount ");
                        int wit = sc.nextInt();
                        sql2 = "UPDATE customeraccount set currBalance=currBalance-wit WHERE id='{i}'";
                        int rows = stmt.executeUpdate(sql2);
                        System.out.println("Rows impacted : " + rows);
                        out.println("Withdraw amount is " + wit);
                    }
                    break;
                }

            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            out.println("<h2>"+e+"</h2>");
        } catch (Exception e) {
            out.println("<h2>"+e+"</h2>");
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
                out.println("<h2>"+e+"</h2>");
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                out.println("<h2>"+e+"</h2>");
            }
        }

    }
}