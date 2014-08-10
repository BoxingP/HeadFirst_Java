import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangerTest {

    @Test
    public void numberContainsTheFirstShouldReturnFizz() {
        assertThat(new Changer(new int[] {2}).change(12), is("Fizz"));
    }

    @Test
    public void numberIsMultipleOfTheFirstShouldReturnFizz() {
        assertThat(new Changer(new int[] {2}).change(4), is("Fizz"));
    }

    @Test
    public void numberIsMultipleOfTheSecondShouldReturnBuzz() {
        assertThat(new Changer(new int[] {2,3}).change(9), is("Buzz"));
    }

    @Test
    public void numberIsMultipleOfTheThirdShouldReturnWhizz() {
        assertThat(new Changer(new int[] {2,3,5}).change(35), is("Whizz"));
    }
    
    @Test
    public void numberIsMultipleOfTheFourthShouldReturnMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(49), is("Murmur"));
    }
    
    @Test
    public void numberIsMultipleOfTheFifthShouldReturnBabble() {
        assertThat(new Changer(new int[] {2,3,4,5,7}).change(49), is("Babble"));
    }
    
    @Test
    public void numberIsMultipleOfTheFirstAndSecondShouldReturnFizzBuzz() {
        assertThat(new Changer(new int[] {2,3}).change(6), is("FizzBuzz"));
    }

    @Test
    public void numberIsMultipleOfTheFirstAndThirdShouldReturnFizzWhizz() {
        assertThat(new Changer(new int[] {2,3,5}).change(10), is("FizzWhizz"));
    }
    
    @Test
    public void numberIsMultipleOfTheFirstAndFourthShouldReturnFizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(14), is("FizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfTheFirstAndFifthShouldReturnFizzBabble() {
        assertThat(new Changer(new int[] {2,3,4,5,7}).change(14), is("FizzBabble"));
    }
    
    @Test
    public void numberIsMultipleOfTheSecondAndThirdShouldReturnBuzzWhizz() {
        assertThat(new Changer(new int[] {2,3,5}).change(15), is("BuzzWhizz"));
    }

    @Test
    public void numberIsMultipleOfTheSecondAndFourthShouldReturnBuzzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(63), is("BuzzMurmur"));
    }
    
    @Test
    public void numberIsMultipleOfTheSecondAndFifthShouldReturnBuzzBabble() {
        assertThat(new Changer(new int[] {2,3,4,5,7}).change(63), is("BuzzBabble"));
    }
    
    @Test
    public void numberIsMultipleOfTheThirdAndFourthShouldReturnWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(35), is("WhizzMurmur"));
    }
    
    @Test
    public void numberIsMultipleOfTheThirdAndFifthShouldReturnWhizzBabble() {
        assertThat(new Changer(new int[] {2,3,5,6,7}).change(35), is("WhizzBabble"));
    }
    
    @Test
    public void numberIsMultipleOfTheFourthAndFifthShouldReturnMurmurBabble() {
        assertThat(new Changer(new int[] {2,3,4,5,7}).change(35), is("MurmurBabble"));
    }
    
    @Test
    public void numberIsMultipleOfFirstSecondThirdShouldReturnFizzBuzzWhizz() {
        assertThat(new Changer(new int[] {2,3,5}).change(30), is("FizzBuzzWhizz"));
    }

    @Test
    public void numberIsMultipleOfFirstSecondFourthShouldReturnFizzBuzzMurmur() {
        assertThat(new Changer(new int[] {1,2,3,5}).change(20), is("FizzBuzzMurmur"));
    }

    @Test
    public void numberIsMultipleOfFirstSecondFifthShouldReturnFizzBuzzBabble() {
        assertThat(new Changer(new int[] {1,2,3,5,7}).change(28), is("FizzBuzzBabble"));
    }

    @Test
    public void numberIsMultipleOfFirstThirdFourthShouldReturnFizzWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(70), is("FizzWhizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfFirstThirdFifthShouldReturnFizzWhizzBabble() {
        assertThat(new Changer(new int[] {1,2,3,5,7}).change(63), is("FizzWhizzBabble"));
    }

    @Test
    public void numberIsMultipleOfFirstFourthFifthShouldReturnFizzMurmurBabble() {
        assertThat(new Changer(new int[] {1,2,3,5,7}).change(35), is("FizzMurmurBabble"));
    }
    
    @Test
    public void numberIsMultipleOfSecondThirdFourthShouldReturnBuzzWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,9}).change(45), is("BuzzWhizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfSecondThirdFifthShouldReturnBuzzWhizzBabble() {
        assertThat(new Changer(new int[] {2,3,5,7,9}).change(45), is("BuzzWhizzBabble"));
    }

    @Test
    public void numberIsMultipleOfSecondFourthFifthShouldReturnBuzzMurmurBabble() {
        assertThat(new Changer(new int[] {2,3,5,7,9}).change(63), is("BuzzMurmurBabble"));
    }

    @Test
    public void numberIsMultipleOfThirdFourthFifthShouldReturnWhizzMurmurBabble() {
        assertThat(new Changer(new int[] {7,2,3,5,9}).change(45), is("WhizzMurmurBabble"));
    }

    @Test
    public void numberIsMultipleOfAllExceptFirstShouldReturnBuzzWhizzMurmurBabble() {
        assertThat(new Changer(new int[] {2,3,5,7,9}).change(315), is("BuzzWhizzMurmurBabble"));
    }
    
    @Test
    public void numberIsMultipleOfAllExceptSecondShouldReturnFizzWhizzMurmurBabble() {
        assertThat(new Changer(new int[] {1,2,3,5,9}).change(45), is("FizzWhizzMurmurBabble"));
    }

    @Test
    public void numberIsMultipleOfAllExceptThirdShouldReturnFizzBuzzMurmurBabble() {
        assertThat(new Changer(new int[] {1,2,3,5,7}).change(70), is("FizzBuzzMurmurBabble"));
    }

    @Test
    public void numberIsMultipleOfAllExceptFourthShouldReturnFizzBuzzWhizzBabble() {
        assertThat(new Changer(new int[] {1,2,3,5,7}).change(42), is("FizzBuzzWhizzBabble"));
    }

    @Test
    public void numberIsMultipleOfAllExceptFifthShouldReturnFizzBuzzWhizzMurmur() {
        assertThat(new Changer(new int[] {1,2,3,5,7}).change(30), is("FizzBuzzWhizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfAllShouldReturnFizzBuzzWhizzMurmurBabble() {
        assertThat(new Changer(new int[] {1,2,3,4,5}).change(60), is("FizzBuzzWhizzMurmurBabble"));
    }   

    @Test
    public void numberNotRelateToAnyShouldReturnItself() {
        assertThat(new Changer(new int[] {2,3,4,5,6,7}).change(11), is("11"));
    }

}
