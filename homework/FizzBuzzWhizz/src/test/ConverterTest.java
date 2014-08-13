import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConverterTest {
    
    @Test
    public void inputElementsIsNumbersShouldBeConvertedCorrectly() {
        assertThat (new Converter(new String[]{"2", "3", "4"}).convert(), is(new int[]{2,3,4}));
    }
    
    @Test
    public void inputStringContainsOthersShouldReturnZero() {
        assertThat (new Converter(new String[]{"2","a","3"}).convert(), is(new int[]{2,0,0}));
    }

}
