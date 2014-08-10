import java.io.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzWhizzTest {
    private ByteArrayInputStream input;
    private ByteArrayOutputStream output;
    private String separator = System.getProperty("line.separator");

    @Before
    public void init() {
        input = new ByteArrayInputStream("2 3 5".getBytes());
        System.setIn(input);
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testNumberContainsTheFirstShouldReturnFizz() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        fizzBuzzWhizz.process(24);
        assertThat(output.toString(), is("Fizz"+separator));
    }

    @Test
    public void testNumberIsMultipleShouldReturnCorrespondingTag() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        fizzBuzzWhizz.process(30);
        assertThat(output.toString(), is("FizzBuzzWhizz"+separator));
    }
    
    @Test
    public void testNumberNotRelateToAnyShouldReturnItself() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        fizzBuzzWhizz.process(61);
        assertThat(output.toString(), is("61"+separator));
    }
}

