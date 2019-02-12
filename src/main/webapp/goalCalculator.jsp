

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <title>Saving Goal Calculator</title>
    </head>
    <body>
        
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


            <form class="fields" action="PerformCalculations" method="post">
                <div class="inside">
                    <h2>SAVING GOAL CALCULATOR</h2>
                </div>
                <div class="inside">
                    <h3>Please provide us next information:</h3>
                </div>
                    <div class="inside">
                    <label>The regular payment per period (the target amount desired):</label>
                    <input type="double" name="fv" value="${CalculationData.currency}" required><br>
                </div>
                <div class="inside">
                    <label>The annual interest expected (%):</label>
                    <input type="double" name="rate" value="${CalculationData.interest}" required><br>
                </div>
                <div class="inside">
                    <label>The length of time for savings expressed (years):</label>
                    <input type="double" name="n" value="${CalculationData.rate}" required><br>
                </div>
                <div class="inside">
                    <label>&nbsp;</label>
                    <input type="submit" name="submit" value="Calculate saving goal">
                    <label>&nbsp;</label>
                    <input type="reset" value="Reset">
                </div>
            </form>
        </div>    
        
    
    </body>
</html>
