
package me.saukin.beans;


public class CalculationData {
    
    private double currency;
    private double interest;
    private double term;
    private double answer;
    

    public CalculationData() {
        
    }

    public CalculationData(double currency, double interest, double term, double answer) {
        this.currency = currency;
        this.interest = interest;
        this.term = term;
        this.answer = answer;
        
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

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.currency) ^ (Double.doubleToLongBits(this.currency) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.interest) ^ (Double.doubleToLongBits(this.interest) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.term) ^ (Double.doubleToLongBits(this.term) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
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
        
        return true;
    }

    @Override
    public String toString() {
        return "CalculationData{" + "currency=" + currency + ", interest=" + interest + ", term=" + term + ", answer=" + answer + '}';
    }

    
    
    
    
}
