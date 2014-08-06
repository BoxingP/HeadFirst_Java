import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberChangerTest {

    private NumberChanger changer;    
    private int[] number;

    @Before
    public void initObjects() {
        changer = new NumberChanger(new String[] {"3","4","5"});
    }

    @Test
    public void numberContainsTheFirstShouldReturnFizz() {
        String changeContains = changer.change(13);
        assertEquals("Fizz", changeContains);
    }

    @Test
    public void numberIsMultipleOfTheFirstShouldReturnFizz() {
        String change = changer.change(9);
        assertEquals("Fizz", change);
    }

    @Test
    public void numberIsMultipleOfTheSecondShouldReturnBuzz() {
        String change = changer.change(16);
        assertEquals("Buzz", change);
    }

    @Test
    public void numberIsMultipleOfTheThirdShouldReturnWhizz() {
        String change = changer.change(55);
        assertEquals("Whizz", change);
    }
    
    @Test
    public void numberIsMultipleOfTheFirstAndSecondShouldReturnFizzBuzz() {
        String change = changer.change(24);
        assertEquals("FizzBuzz", change);
    }

    @Test
    public void numberIsMultipleOfTheFirstAndThirdShouldReturnFizzWhizz() {
        String change = changer.change(15);
        assertEquals("FizzWhizz", change);
    }

    @Test
    public void numberIsMultipleOfTheSecondAndThirdShouldReturnBuzzWhizz() {
        String change = changer.change(20);
        assertEquals("BuzzWhizz", change);
    }

    @Test
    public void numberIsMultipleOfAllShouldReturnFizzBuzzWhizz() {
        String change = changer.change(60);
        assertEquals("FizzBuzzWhizz", change);
    }

    @Test
    public void numberNotRelateToAnyShouldReturnItself() {
        String change = changer.change(61);
        assertEquals("61", change);
    }

}
