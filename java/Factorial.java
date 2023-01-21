/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Factorial extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
            int fact=1;
            int num=Integer.parseInt(request.getParameter("factNum"));
             for(int i=1;i<=num;i++){
                 fact=fact*i;
             }
            out.println("Factorial number is:" +fact);

        }
    }

 
   
      