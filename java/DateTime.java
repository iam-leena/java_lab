
import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTime extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            Date d = new Date();
//            DateTime dtt = new DateTime();
            String s = d.toString();
          out.println("The current date and time is :"+s);
      
    }

}
