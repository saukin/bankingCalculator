<%-- 
    Document   : welcome
    Created on : Feb 4, 2019, 4:55:01 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to our service</title>
    </head>
    <body>
        <h2>Welcome to our online banking calculator</h2>
        <h3>here you may calculate your:</h3> 
        <ul style="list-style-type:circle">
            <li>monthly payments for a loan</li>
            <li>future value of savings</li>
            <li>monthly payments to reach savings goal</li>
        </ul>
        
        <h3>Please select an option below</h3>
        
        <form action="personalInfo">
            <select name = "action">
                <option>Enter personal information for further contact</option>
                <option>Calculate monthly payment for a loan</option>
                <option>Calculate future value of savings</option>
                <option>Calculate monthly payments to reach savings goal</option>

                <input type="submit" value="Submit">
            </select>
        
    </body>
</html>
