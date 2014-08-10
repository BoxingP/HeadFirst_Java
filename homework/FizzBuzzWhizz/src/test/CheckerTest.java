import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckerTest {
    
    @Test
    public void specialNumberShouldBeDifferentDigit() {
        assertThat(new Checker(new int[]{2,3,4}).check(), is(true));
    } 
    
    @Test
    public void specialNumberIsEmptyShouldReturnFalse() {
        assertThat(new Checker(new int[]{}).check(), is(false));
    }

    @Test
    public void specialNumberNotDigitShouldReturnFalse() {
        assertThat(new Checker(new int[]{12,123,1234}).check(), is(false));
    }
    
    @Test
    public void specialNumberNotDifferentShouldReturnFalse() {
        assertThat(new Checker(new int[]{2,3,4,4}).check(), is(false));
    }

}
