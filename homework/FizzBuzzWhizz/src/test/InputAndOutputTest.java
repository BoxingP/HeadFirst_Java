import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputAndOutputTest {
    
    private InputAndOutput io;
    private MockSystemInput ms;

    @Before
    public void initObjects() {
        io = new InputAndOutput();
        ms = new MockSystemInput();
    }

    @Test
    public void inputShouldBeSplitedByNonnumericCorrectly() {
        ms.set("2i3.4 5");
        String[] input = io.getInput(ms);
        int result = input.length;
        assertEquals(4, result);
    }

    @Test
    public void ouputShouldReturnString() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String separator = System.getProperty("line.separator");
        io.printOutput("FizzBuzzWhizz");
        assertEquals("FizzBuzzWhizz"+separator, output.toString());
    }
} 

class MockSystemInput implements Input{
    private String input;
    
    public void set(String s){
        input = s;
    }
    public String get(){
        return input;
    }
}
    
