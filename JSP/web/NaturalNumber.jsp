<%-- 
    Document   : NaturalNumber
    Created on : Jan 27, 2023, 10:55:07 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
            int num=Integer.parseInt(request.getParameter("n"));
            int sum=0;
            int fact=1;
            for(int i=0;i<=num;i++){  
               sum+= i;  
        }
         out.println("The sum of natural number is:"+sum);
         out.println("<br/>");
               
         if(num%2==0){
             out.println("Even number"); 
               }else{
             out.println("Odd number"); 
         }
         out.println("<br/>");
         
         for(int i=1;i<=num;i++){
              fact*= i;
               }
                out.println("The factorial of the given number is:"+fact); 
                out.println("<br/>");
      
         %>
    </body>
</html>
