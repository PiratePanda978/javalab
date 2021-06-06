import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Reg")

public class JDBC extends HttpServlet{
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String URL = "jdbc:mysql://localhost/data2";
        String USER = "root";
        String PASS = "Anup@mIIO9";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(URL,USER,PASS);
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("select * from REGISTRATION");
            out.println("<table border=\"1\">");
            while(rs.next()){
                out.println("<tr>");
                out.println("<td>"+rs.getInt("id")+"</td>");
                out.println("<td>"+rs.getString("first")+"</td>");
                out.println("<td>"+rs.getString("last")+"</td>");
                out.println("<td>"+rs.getInt("age")+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            if(out!=null)
            out.close();
        }
    }
}
