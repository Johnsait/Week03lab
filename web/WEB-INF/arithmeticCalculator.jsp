<%-- 
    Document   : arithmeticCalculator
    Created on : 29-Jan-2023, 5:15:41 PM
    Author     : JohnC. <john.crudo@edu.sait.ca>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="firstnum">
            <br>
            Second: <input type="text" name="secondnum">
            <br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%">
            <br>
            <br>
        </form>
        <div>Result: ${showResult}</div>
        <a href="age">Age Calculator</a>
    </body>
</html>
