<%-- 
    Document   : displayEmail
    Created on : Feb 11, 2019, 6:43:52 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <title>Personal Information</title>
    </head>
    <body>
        <section>
            <header>
                <div class="inside">
                    <h1>Dear ${user.firstName}, thank you for registering in our service</h1>
                </div>
                <div class="inside">
                    <h3>Here is the information that you entered: </h3>
                </div>
                <div class="inside">
                    <label>Email:</label>
                    <span>${user.email}</span><br>
                </div>
                <div class="inside">
                    <label>First Name:</label>
                    <span>${user.firstName}</span><br>
                </div>    
                <div class="inside">
                    <label>Last Name:</label>
                    <span>${user.lastName}</span><br>
                </div>    
            </header>
        </section>
        
        <div> 
            <form class="button" action="userInfo.jsp" method="post">
                <input class="submit" type="submit" value="JOIN OUR EMAIL LIST">
            </form> 


            <form  class="button" action="loanCalculator.jsp" method="post">
                <input class="submit" type="submit" value="MONTHLY PAYMENTS FOR A LOAN">
            </form>


            <form  class="button" action="futureValueCalculator.jsp" method="post">
                <input class="submit" type="submit" value="FUTURE VALUE OF SAVINGS">
            </form>


            <form  class="button" action="goalCalculator.jsp" method="post">
                <input class="submit" type="submit" value="SAVING GOALS">
            </form>
        </div>    
        
    </body>
</html>
