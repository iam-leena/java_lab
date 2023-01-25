import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeesDetail extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
            String name=request.getParameter("EmpName");
            String address=request.getParameter("EmpAddress");
            String designation=request.getParameter("design");
            String department=request.getParameter("dept");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3300/Employees";
                Connection con = DriverManager.getConnection(url,"root","");
                
                PreparedStatement ps=con.prepareStatement(  
                "insert into registerUser values(?,?,?,?)");  

                ps.setString(1,name);  
                ps.setString(2,address);  
                ps.setString(3,designation);  
                ps.setString(4,department);
                
//               int i=ps.executeUpdate();  
//                if(i>0)  
//                out.println("You are successfully registered...");  
                int result=ps.executeUpdate();
            if(result!=-1){
                out.println("Inserted Successfully\n");
            }else{
                out.println("Fail to insert");
            }
            out.println("<br/>");
            out.println("Employess name:"+name);
            out.println("<br/>");
            out.println("Address:"+address);
            out.println("<br/>");
            out.println("\nDesignation:"+designation);
            out.println("<br/>");
            out.println("\nDepartment name:"+department);

                }catch(Exception e){
                e.printStackTrace();
                 }
            out.close();
    }
}