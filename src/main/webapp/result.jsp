

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <title>Results</title>
    </head>
    <body>
        
        
        <h1>${option.option}   ${answer}</h1>
        
    
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
