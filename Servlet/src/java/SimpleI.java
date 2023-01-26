
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            
            int p=Integer.parseInt(request.getParameter("principle"));
             int t=Integer.parseInt(request.getParameter("time"));
              int r=Integer.parseInt(request.getParameter("rate"));
              
              int result = (p*t*r)/100;
              out.println(result+ " is a simple Interest.");

    }
}


