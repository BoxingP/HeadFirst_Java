import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConverterTest {
    
    @Test
    public void inputStringContainsNumbersShouldBeSplittedCorrectly() {
        assertThat (new Converter("2 3 4").convert(), is(new int[]{2,3,4}));
    }
    
    @Test
    public void inputStringNotContainsNumberShouldReturnNull() {
        assertThat (new Converter("abc").convert(), is(new int[]{}));
    }

}
