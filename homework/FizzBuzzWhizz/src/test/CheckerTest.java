import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckerTest {
    
    @Test
    public void specialNumberShouldBeThreeDifferentDigit() {
        assertThat(new Checker(new int[]{2,3,4}).check(), is(true));
    } 
    
    @Test
    public void specialNumberIsNoneShouldReturnFalse() {
        assertThat(new Checker(new int[]{}).check(), is(false));
    }

    @Test
    public void specialNumberNotThreeShouldReturnFalse() {
        assertThat(new Checker(new int[]{2,3}).check(), is(false));
    }

    @Test
    public void specialNumberNotDigitShouldReturnFalse() {
        assertThat(new Checker(new int[]{12,123,1234}).check(), is(false));
    }
    
    @Test
    public void specialNumberNotDifferentShouldReturnFalse() {
        assertThat(new Checker(new int[]{3,3,7}).check(), is(false));
    }

}
