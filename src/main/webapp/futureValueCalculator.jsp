

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>FUTURE VALUE CALCULATOR</h2>
        <p>Please provide us next information:</p>
        <form action="Calculations" method="post">
            <label>The regular payment per period (the amount set  aside):</label>
            <input type="number" name="pmt" value="${CalculationData.currency}" required><br>
            <label>The interest rate per period (%):</label>
            <input type="number" name="rate" value="${CalculationData.interest}" required><br>
            <label>The number of periods(years):</label>
            <input type="number" name="n" value="${CalculationData.rate}" required><br>
            <label>&nbsp;</label>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>
        
    </body>
</html>
