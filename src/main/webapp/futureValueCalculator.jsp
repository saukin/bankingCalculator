

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <title>Future Value Calculator</title>
    </head>
    <body>
        
        
        <div> 
        <form class="button" action="userInfo.jsp" method="post">
            <input class="submit" type="submit" value="JOIN OUR EMAIL LIST">
        </form> 
                  
        
        <form  class="button" action="loanCalculator.jsp" method="post">
            <input class="submit" type="submit" value="MONTHLY PAYMENTS FOR A LOAN">
        </form>
          
            
        <form class="fields" action="PerformCalculations" method="post">
            <div class="inside">
                <h2>${option}</h2>
            </div>
            <div class="inside">
                <h3>Please provide us next information:</h3>
            </div>
            <div class="inside">
                <label>The regular payment per period (the amount set  aside):</label>
                <input type="double" name="pmt" value="${CalculationData.currency}" required><br>
            </div>
            <div class="inside">
                <label>The interest rate per period (%):</label>
                <input type="double" name="rate" value="${CalculationData.interest}" required><br>
            </div>
            <div class="inside">
                <label>The number of periods(years):</label>
                <input type="double" name="n" value="${CalculationData.rate}" required><br>
            </div>
            <div class="inside">
                <label>&nbsp;</label>
                <input type="submit" name="submit" value="Calculate future savings">
                <label>&nbsp;</label>
                <input type="reset" value="Reset">
            </div>
        </form>
            
            
        <form  class="button" action="goalCalculator.jsp" method="post">
            <input class="submit" type="submit" value="SAVING GOALS">
        </form>
        </div>    
        
        
        
        
        
    </body>
</html>
