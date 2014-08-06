import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class NumberCheckerTest {
    private NumberChecker checker;
    private String[] number;
    @Test
    public void testNumbersShouldBeThreeDifferentDigit() {
        number = new String[] {"2","3","4"};
        checker = new NumberChecker(number);
        boolean result = checker.check();
        assertTrue(result);
    } 

    @Test
    public void testNumbersNotThreeShouldReturnFalse() {
        number = new String[] {"2","3"};
        checker = new NumberChecker(number);
        boolean result = checker.check();
        assertFalse(result);
    }

    @Test
    public void testNumbersNotDigitShouldReturnFalse() {
        number = new String[] {"12","123","1234"};
        checker = new NumberChecker(number);
        boolean result = checker.check();
        assertFalse(result);
    }
    
    @Test
    public void testNumberNotDifferentShouldReturnFalse() {
        number = new String[] {"3","3","7"};
        checker = new NumberChecker(number);
        boolean result = checker.check();
        assertFalse(result);
    }

}
