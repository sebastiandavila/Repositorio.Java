import static org.junit.Assert.assertTrue;

import org.junit.Test;
 

public class CalculatorTest {
    private Calculadora calculator = new Calculadora();
 
    @Test
    public void testSumPositiveValues_withNegativeValues() {
        int result = calculator.SumaPositivos(-10, -20, -30);
        assertTrue(result == 0);
    }
}