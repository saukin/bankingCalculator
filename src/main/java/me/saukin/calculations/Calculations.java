
package me.saukin.calculations;

import me.saukin.beans.CalculationData;


public class Calculations {
    
    public void loanCalculation (CalculationData calculationData) {
        
        double pv = calculationData.getCurrency();
        double rate = calculationData.getInterest();
        double n = calculationData.getTerm();
        
        double pmt = pv*(rate/(1 - Math.pow((1 + rate), -n)));
       
        calculationData.setAnswer(pmt);
        
    }
    
    public void futureValueCalculation (CalculationData calculationData) {
        
        double pmt = calculationData.getCurrency();
        double rate = calculationData.getInterest();
        double n = calculationData.getTerm();
        
        double fv = pmt*((1 - Math.pow((1 + rate), -n))/rate);
        
        calculationData.setAnswer(fv);
    }
    
    public void savingGoalCalculation (CalculationData calculationData) {
        
        double fv = calculationData.getCurrency();
        double rate = calculationData.getInterest();
        double n = calculationData.getTerm();
        
        double pmt = fv*(rate/(1 - Math.pow((1 + rate), -n)));
        
        calculationData.setAnswer(pmt);
    }
    
    
}
