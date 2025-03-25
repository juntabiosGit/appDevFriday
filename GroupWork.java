// GroupWork.java
import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Calculator(); // Call the Calculator method
    }

    static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("COLLAB CALCULATION\n");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Using methods from Calculator (added below)
        System.out.println("Sum: " + Calculator.add(num1, num2)); // Group 1's method
        System.out.println("Multiply: " + Calculator.mul(num1, num2)); // Group 3's method
        System.out.println("Are they equal? " + Calculator.isEqual(num1, num2)); // Group 10's method

        if (num2 != 0) {
            System.out.println("Remainder: " + Calculator.modulus(num1, num2)); // Group 5's method
            System.out.println("Divide: " + Calculator.div(num1, num2)); // Group 4's method
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Number Squared: " + Calculator.square(num1)); // Group 6's method
        System.out.println("Subtraction: " + Calculator.subtract(num1, num2)); // Group 2's method

        scanner.close(); // Close scanner to prevent resource leak
    }
}

// Placeholder Calculator class with static methods
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    static boolean isEqual(int a, int b) {
        return a == b;
    }

    static int square(int a) {
        return a * a;
    }
}
