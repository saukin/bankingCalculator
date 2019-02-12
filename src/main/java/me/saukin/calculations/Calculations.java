
package me.saukin.calculations;

import me.saukin.beans.CalculationData;


public class Calculations {
    
    
    
    public void loanCalculation (CalculationData calculationData) {
        
        double pv = calculationData.getCurrency();
        double rate = calculationData.getInterest()/100.0/12;
        double n = calculationData.getTerm()*12;
        
        double pmt = Math.abs(pv*(rate/(1 - Math.pow((1 + rate), -n))));
       
        calculationData.setAnswer(pmt);
        calculationData.setOption("If your amount of the loan is " + pv + "$, "
                + "the rate of interest is " + calculationData.getInterest() + "%, "
                + "the length is " + calculationData.getTerm() + " years, "
                + "your monthly payment for the loan will be: ");
    }
    
    public void futureValueCalculation (CalculationData calculationData) {
        
        double pmt = calculationData.getCurrency();
        double rate = calculationData.getInterest()/100.0/12;
        double n = calculationData.getTerm()*12;
        
        double fv = Math.abs(pmt*((1 - Math.pow((1 + rate), n))/rate));
        
        calculationData.setAnswer(fv);
        calculationData.setOption("If your amount put aside each month is " + pmt + "$, "
                + "the rate of annual interest on savings is " + calculationData.getInterest() + "%, "
                + "the length of time that money will be put aside expressed is " + calculationData.getTerm() + " years, "
                + "your future value of savings will be: ");
    }
    
    public void savingGoalCalculation (CalculationData calculationData) {
        
        double fv = calculationData.getCurrency();
        double rate = calculationData.getInterest()/100.0/12;
        double n = calculationData.getTerm()*12;
        
        double pmt = Math.abs(fv*(rate/(1 - Math.pow((1 + rate), n))));
        
        calculationData.setAnswer(pmt);
        calculationData.setOption("If your target amount desired is " + fv + "$, "
                + "the annual interest rate expected is " + calculationData.getInterest() + "%, "
                + "the length of time for savings expressed is " + calculationData.getTerm() + " years, "
                + "Monthly payment to reach your saving goal is: ");
    }
    
    
}
