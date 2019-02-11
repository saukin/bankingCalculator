
package me.saukin.calculations;

import me.saukin.beans.CalculationData;


public class Calculations {
    
    public void loanCalculation (CalculationData calculationData) {
        
        double pv = calculationData.getCurrency();
        double rate = calculationData.getInterest()/100.0/12;
        double n = calculationData.getTerm()*12;
        
        double pmt = Math.abs(pv*(rate/(1 - Math.pow((1 + rate), -n))));
       
        calculationData.setAnswer(pmt);
        
    }
    
    public void futureValueCalculation (CalculationData calculationData) {
        
        double pmt = calculationData.getCurrency();
        double rate = calculationData.getInterest()/100.0/12;
        double n = calculationData.getTerm()*12;
        
        double fv = Math.abs(pmt*((1 - Math.pow((1 + rate), n))/rate));
        
        calculationData.setAnswer(fv);
    }
    
    public void savingGoalCalculation (CalculationData calculationData) {
        
        double fv = calculationData.getCurrency();
        double rate = calculationData.getInterest()/100.0/12;
        double n = calculationData.getTerm()*12;
        
        double pmt = Math.abs(fv*(rate/(1 - Math.pow((1 + rate), n))));
        
        calculationData.setAnswer(pmt);
    }
    
    
}
