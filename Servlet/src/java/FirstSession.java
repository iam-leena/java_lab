import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
public class FirstSession extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
         String name=request.getParameter("username");
         out.print("Welcome "+name);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",new String(name)); 
        
        out.print("<br/>You set your username in the session<br/>");  
       
//         String n=(String)session.getAttribute("uname");  
//        out.print("Hello "+n);  
//        out.print("<a href='ReadfromSession'>visit</a>");
//        session.invalidate();
        out.close(); 
        
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }