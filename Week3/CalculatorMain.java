package Week3;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("The value is: " + calc.getValue());
        calc.add(10);
        System.out.println("The value is: " + calc.getValue());
        calc.subtract(5);
        System.out.println("The value is: " + calc.getValue());
        calc.multiply(20);
        System.out.println("The value is: " + calc.getValue());
        calc.divide(25);
        System.out.println("The value is: " + calc.getValue());
    }
}
