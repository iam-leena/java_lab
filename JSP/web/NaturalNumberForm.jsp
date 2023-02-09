<%-- 
    Document   : NaturalNumberForm
    Created on : Jan 27, 2023, 10:57:39 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="NaturalNumber.jsp">
        Enter a number:<input type="text" name="n"/>
        <input type="submit" value="submit"/>
        </form>
        
        
      
        <form action="MaxMinNumber.jsp">
        First number:<input type="text" name="FirstNum"/>
        Second number:<input type="text" name="SecondNum"/>
        Third number:<input type="text" name="ThirdNum"/>
        <input type="submit" value="submit"/>
        </form>
      

      
        <form action="SimpleInterest.jsp">
        Principle:<input type="text" name="princi"/>
        Time:<input type="text" name="time"/>
        Rate:<input type="text" name="rate"/>
        <input type="submit" value="submit"/>
        </form>
        
        
      
      
    </body>
</html>
