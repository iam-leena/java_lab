import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 

public class ReadfromSession extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession(true);  
        String n=(String)session.getAttribute("uname");  
        out.print("Hello "+n);  
  
        out.close();  
  
        }catch(Exception e){
            System.out.println(e);
          }  
    }  
      
  
}  