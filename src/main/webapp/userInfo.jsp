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
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <title>Registration</title>
    </head>
    <body>
        
        
        <div> 
        <form class="fields" action="AddAnEmail" method="post">
            <h2>Please provide your personal information</h2>
            <div class="inside">
                <label>Email:</label>
                <input type="email" name="email" value="${userData.email}" required><br>
            </div>    
            <div class="inside">
                <label>First Name:</label>
                <input type="text" name="firstName" value="${userData.firstName}" required><br>
            </div>
            <div class="inside">
                <label>Last Name:</label>
                <input type="text" name="lastName" value="${userData.lastName}" required><br>
            </div>
            <div class="inside">
                <label>&nbsp;</label>
                <input type="reset">
                <label>&nbsp;</label>
                <input type="submit" value="Join Now">
            </div>
        </form>
                  
        
        <form class="button" action="loanCalculator.jsp" method="post">
            <input class="submit" type="submit" value="MONTHLY PAYMENTS FOR A LOAN">
        </form>
          
            
        <form class="button" action="futureValueCalculator.jsp" method="post">
            <input class="submit" type="submit" value="FUTURE VALUE OF SAVINGS">
        </form>
            
            
        <form class="button" action="goalCalculator.jsp" method="post">
            <input class="submit" type="submit" value="SAVING GOALS">
        </form>
        </div>    
        
        
        
      
        
    </body>
</html>
