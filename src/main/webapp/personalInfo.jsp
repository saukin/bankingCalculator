<%-- 
    Document   : personalInfo
    Created on : Feb 4, 2019, 7:06:30 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h2>Please provide your personal information</h2>
        <form action="UserData" method="post">
            <label class="pad_top">Email:</label>
            <input type="email" name="email" value="${user.email}" required><br>
            <label class="pad_top">First Name:</label>
            <input type="text" name="firstName" value="${user.firstName}" required><br>
            <label class="pad_top">Last Name:</label>
            <input type="text" name="lastName" value="${user.lastName}" required><br>
            <label>&nbsp;</label>
            <input type="reset">
            <input type="submit" value="Join Now" class="margin_left">
        </form>
    </body>
</html>
