
package me.saukin.beans;

import java.util.Objects;


public class CalculationData {
    
    private double currency;
    private double interest;
    private double term;
    private double answer;
    private String option = "";
    

    public CalculationData() {
        this.currency = 0.0;
        this.interest = 0.0;
        this.term = 0.0;
        this.answer = 0.0;
        this.option = "";
    }

    public CalculationData(double currency, double interest, double term, double answer, String option) {
        this.currency = currency;
        this.interest = interest;
        this.term = term;
        this.answer = answer;
        this.option = option;
    }

    public double getCurrency() {
        return currency;
    }

    public double getInterest() {
        return interest;
    }

    public double getTerm() {
        return term;
    }

    public double getAnswer() {
        return answer;
    }
    
    public String getOption() {
        return option;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setTerm(double term) {
        this.term = term;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
    
    public void setOption(String option) {
        this.option = option;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.currency) ^ (Double.doubleToLongBits(this.currency) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.interest) ^ (Double.doubleToLongBits(this.interest) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.term) ^ (Double.doubleToLongBits(this.term) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.option);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CalculationData other = (CalculationData) obj;
        if (Double.doubleToLongBits(this.currency) != Double.doubleToLongBits(other.currency)) {
            return false;
        }
        if (Double.doubleToLongBits(this.interest) != Double.doubleToLongBits(other.interest)) {
            return false;
        }
        if (Double.doubleToLongBits(this.term) != Double.doubleToLongBits(other.term)) {
            return false;
        }
        if (Double.doubleToLongBits(this.answer) != Double.doubleToLongBits(other.answer)) {
            return false;
        }
        if (!Objects.equals(this.option, other.option)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CalculationData{" + "currency=" + currency + ", interest=" + interest + ", term=" + term + ", answer=" + answer + ", option=" + option + '}';
    }

    

    
    
    
    
}
