import static org.junit.Assert.assertTrue;

import org.junit.Test;
 

public class CalculatorTest {
    private Calculadora calculator = new Calculator();
 
    @Test
    public void testSumPositiveValues_withNegativeValues() {
        int result = calculator.sumPositiveValues(-10, -20, -30);
        assertTrue(result == 0);
    }
}