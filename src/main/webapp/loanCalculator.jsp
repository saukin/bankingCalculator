<%-- 
    Document   : calculator
    Created on : Feb 4, 2019, 7:08:21 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <title>Loan Calculator</title>
    </head>
    <body>
        
        <h1>Online banking calculator</h1>
        
        <div> 
        <form class="button" action="userInfo.jsp" method="post">
            <input class="submit" type="submit" value="JOIN OUR EMAIL LIST">
        </form> 
                  
        
        <form class="fields" action="PerformCalculations" method="post">
            <div class="inside">
                <h2>LOAN CALCULATOR</h2>
            </div>
            <div class="inside">
                <h3>Please provide us next information:</h3>
            </div>
            <div class="inside">
                <label>the amount of the loan called principal:</label>
            
                <input type="double" name="pv" value="${CalculationData.currency}" required><br>
            </div>    
            <div class="inside">
                <label>The interest rate on an annual basis (%):</label>
                <input type="double" name="rate" value="${CalculationData.interest}" required><br>
            </div>
            <div class="inside">
                <label>The length of the loan (years):</label>
                <input type="double" name="n" value="${CalculationData.rate}" required><br>
            </div>
            <div class="inside">
                <label>&nbsp;</label>
                <input type="submit" name="submit" value="Calculate loan" >
                <label>&nbsp;</label>
                <input type="reset" value="Reset">
            </div>
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
