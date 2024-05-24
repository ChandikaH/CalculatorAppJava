CalculatorAppJava

This project is a simple calculator application implemented in Java.

Description

The CalculatorApp allows the user to perform basic arithmetic operations and a power operation on two decimal numbers. It includes classes for basic and advanced calculations.
Classes and Methods

    Classes:
        Calculator: Performs basic arithmetic operations (addition, subtraction, multiplication, division).
        AdvancedCalculator: Extends Calculator and adds a method for power operation.

    Methods:
        Calculator:
            add(double num1, double num2): Adds two numbers.
            subtract(double num1, double num2): Subtracts one number from another.
            multiply(double num1, double num2): Multiplies two numbers.
            divide(double num1, double num2): Divides one number by another.
        AdvancedCalculator (inherits from Calculator):
            power(double base, double exponent): Computes base raised to the power of exponent.

Usage

    Running the Application:

    To run the CalculatorApp, follow these steps:
        Clone the repository: git clone <repository_url>
        Navigate to the project directory: cd CalculatorAppJava
        Compile the Java files: javac -d bin -cp src src/org/calculator/*.java
        Run the application: java -cp bin org.calculator.CalculatorApp

    Input Instructions:
        Enter the first number when prompted.
        Enter the second number when prompted.
        Choose an operation by entering the corresponding number:
            1: Add
            2: Subtract
            3: Multiply
            4: Divide
            5: Power

    Output:
        The result of the selected operation will be displayed.

Example

    Enter the first number: 10
    Enter the second number: 5
    Choose an operation:
      1: Add
      2: Subtract
      3: Multiply
      4: Divide
      5: Power
    Enter your choice: 3

    The result of 3 is: 50.0

Error Handling

    Division by zero will throw an ArithmeticException.
