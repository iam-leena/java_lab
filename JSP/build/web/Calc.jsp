<%-- 
    Document   : Calc
    Created on : Jan 27, 2023, 11:59:30 AM
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
       <jsp:useBean id="cal" class="Calculator.Calculator"/>

        <%
            int num=Integer.parseInt(request.getParameter("n"));
        int m = cal.cube(num);

        out.print("cube of 5 is" + m);

        %>
    </body>
</html>
