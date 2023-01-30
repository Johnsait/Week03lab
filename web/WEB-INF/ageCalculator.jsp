<%-- 
    Document   : ageCalculator
    Created on : 29-Jan-2023, 4:14:57 PM
    Author     : JohnC. <john.crudo@edu.sait.ca>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="inputage" value="${inputage}" max="150">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${popmsg}</p>
        <a href="arithmetic">Arithmetic Calculator</a>  
    </body>
</html>
