import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDemo extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
           String name=request.getParameter("username");
           String pass=request.getParameter("password");
           
           if(pass.equals("nccs1234")&& name.equals("nccs")){
             
               RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
               rd.forward(request,response);
           }
           else{
               out.print("Sorry UserName or Password Error!");  
                RequestDispatcher rd=request.getRequestDispatcher("/Login.html");
               rd.include(request,response);
           }
        }
    }
