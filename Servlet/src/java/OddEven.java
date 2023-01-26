
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OddEven extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            
            int n=Integer.parseInt(request.getParameter("num1"));
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Odd Even Number</title>");            
//            out.println("</head>");
//            out.println("<body>");
            if(n%10==0){
//                  out.println("<h1> "+n+" is a even number </h1>");
    out.println("Even");
             }else{
                   out.println("Odd");
            }
//            out.println("</body>");
//            out.println("</html>");
    }
}


