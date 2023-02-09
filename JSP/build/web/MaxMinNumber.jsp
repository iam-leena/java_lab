<%-- 
    Document   : MaxMinNumber
    Created on : Jan 27, 2023, 11:41:10 AM
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
         int first=Integer.parseInt(request.getParameter("FirstNum"));
            int second=Integer.parseInt(request.getParameter("SecondNum"));
            int third=Integer.parseInt(request.getParameter("ThirdNum"));
            
         if(first>second && first>third){
             out.println("Max number is:"+first); 
             
               }else if(second>first && second>third){
             out.println("Max number is:"+second); 
         }else{
                   out.println("Max number is:"+third); 
               }
         out.println("<br/>");
         
        if(first<second && first<third){
             out.println("Min number is:"+first); 
             
               }else if(second<first && second<third){
             out.println("Min number is:"+second); 
         }else{
                   out.println("Min number is:"+third); 
               }
         out.println("<br/>");
         %>
    </body>
</html>
