<%-- 
    Document   : SimpleI2020
    Created on : Feb 7, 2023, 10:26:54 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int p=Integer.parseInt(request.getParameter("princi"));
            int t=Integer.parseInt(request.getParameter("time"));
            int r=Integer.parseInt(request.getParameter("rate"));
            
            int SI=(p*t*r)/100;
            
            out.println(SI);

            %>
    </body>
</html>
