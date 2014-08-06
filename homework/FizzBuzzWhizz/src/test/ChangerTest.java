import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangerTest {

    private Changer changer;

    @Before
    public void initObjects() {
        changer = new Changer(new int[] {3,4,5});
    }

    @Test
    public void numberContainsTheFirstShouldReturnFizz() {
        assertThat(changer.change(13), is("Fizz"));
    }

    @Test
    public void numberIsMultipleOfTheFirstShouldReturnFizz() {
        assertThat(changer.change(9), is("Fizz"));
    }

    @Test
    public void numberIsMultipleOfTheSecondShouldReturnBuzz() {
        assertThat(changer.change(16), is("Buzz"));
    }

    @Test
    public void numberIsMultipleOfTheThirdShouldReturnWhizz() {
        assertThat(changer.change(55), is("Whizz"));
    }
    
    @Test
    public void numberIsMultipleOfTheFirstAndSecondShouldReturnFizzBuzz() {
        assertThat(changer.change(24), is("FizzBuzz"));
    }

    @Test
    public void numberIsMultipleOfTheFirstAndThirdShouldReturnFizzWhizz() {
        assertThat(changer.change(15), is("FizzWhizz"));
    }

    @Test
    public void numberIsMultipleOfTheSecondAndThirdShouldReturnBuzzWhizz() {
        assertThat(changer.change(20), is("BuzzWhizz"));
    }

    @Test
    public void numberIsMultipleOfAllShouldReturnFizzBuzzWhizz() {
        assertThat(changer.change(60), is("FizzBuzzWhizz"));
    }

    @Test
    public void numberNotRelateToAnyShouldReturnItself() {
        assertThat(changer.change(61), is("61"));
    }

}
