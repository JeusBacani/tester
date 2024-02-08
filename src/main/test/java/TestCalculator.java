import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    @Test
    public void testAddition() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(6, Calculator.subtract(10, 4));
    }

    @Test
    public void testMultiplication() {
        assertEquals(42, Calculator.multiply(6, 7));
    }

    @Test
    public void testDivision() {
        assertEquals(5.0, Calculator.divide(15.0, 3.0));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10.0, 0.0);
        });
    }
}
