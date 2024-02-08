// TestCalculator.java
public class TestCalculator {
    public static void main(String[] args) {
        // Test addition
        int resultAdd = Calculator.add(5, 3);
        System.out.println("Addition result: " + resultAdd + " (Expected: 8)");

        // Test subtraction
        int resultSubtract = Calculator.subtract(10, 4);
        System.out.println("Subtraction result: " + resultSubtract + " (Expected: 6)");

        // Test multiplication
        int resultMultiply = Calculator.multiply(6, 7);
        System.out.println("Multiplication result: " + resultMultiply + " (Expected: 42)");

        // Test division
        try {
            double resultDivide = Calculator.divide(15.0, 3.0);
            System.out.println("Division result: " + resultDivide + " (Expected: 5.0)");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
