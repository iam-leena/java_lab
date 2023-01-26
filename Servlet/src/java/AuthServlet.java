
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
            String Uname=request.getParameter("name");
            String Upass=request.getParameter("pass");
           
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3300/Auth";
                Connection con = DriverManager.getConnection(url,"root","");
               
               PreparedStatement ps=con.prepareStatement( 
               "Select * from authUser");  
                       
                ResultSet rs=ps.executeQuery(); 
                
                String msg=" ";
                while(rs.next()){
                    if(Uname.equals(rs.getString(1))&& (Upass.equals(rs.getString(2)))){
                  
                        msg="Matched username and password!!";
                        break;
                    }else{
                        msg="oops sorry"; 
                    }
                    
                } 
                out.println(msg);
                }catch(Exception e){
                e.printStackTrace();
                 }
            out.close();
    }
}
  