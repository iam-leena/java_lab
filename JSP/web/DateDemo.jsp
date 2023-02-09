<%-- 
    Document   : DateDemo
    Created on : Jan 27, 2023, 10:21:58 AM
    Author     : Dell
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Date date=new Date();
        out.println("The current time is :"+date.toString());
        %>
        </body>
</html>
