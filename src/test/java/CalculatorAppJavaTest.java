import static org.junit.jupiter.api.Assertions.*;

import org.calculator.AdvancedCalculator;
import org.calculator.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorAppJavaTest {

    // Unit test for addition method
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }

    // Unit test for subtraction method
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.0001);
    }

    // Unit test for multiplication method
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0001);
    }

    // Unit test for division method
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001);
    }

    // Unit test for division by zero, expecting ArithmeticException
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1.0, 0.0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    // Unit test for power method
    @Test
    public void testPower() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        assertEquals(8.0, advancedCalculator.power(2.0, 3.0), 0.0001);
    }
}
