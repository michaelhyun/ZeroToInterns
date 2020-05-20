package Week3;

public class Calculator {
    private double value;
    
    public Calculator() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }
    
    public double add(double amount) {
        value = value+amount;
        return value;
    }
    
    public double subtract(double amount) {
        value = value - amount;
        return value;
    }

    public double multiply(double amount) {
        value = value*amount;
        return value;
    }

    public double divide(double amount) {
        value = value/amount;
        return value;
    }

}
