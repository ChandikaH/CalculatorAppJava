package org.calculator;

import java.util.Scanner;

// This is the main class of our application
public class CalculatorApp {
    public static void main(String[] args) {

        /*
        Class: CalculatorAppJava, Calculator, and AdvancedCalculator are classes.
        Method: add, subtract, multiply, divide, and power are methods within these classes.
        Variables: num1, num2, choice, and result are variables.
        Objects: calculator is an object of the Calculator class.
        Inheritance: AdvancedCalculator inherits from the Calculator class.
         */

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two decimal numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to select an operation
        System.out.println("Choose an operation:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Power");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Create an instance (object) of the Calculator class
        //Calculator calculator = new Calculator();
        AdvancedCalculator calculator = new AdvancedCalculator();

        double result;
        try {
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = calculator.divide(num1, num2);
                    break;
                case 5:
                    result = calculator.power(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, 3, 4 or 5.");
                    return;
            }

            // Display the result of the operation
            System.out.println("The result of " + choice + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
