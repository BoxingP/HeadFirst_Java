import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class InputAndOutputTest {
    
    private InputAndOutput inputAndOutput;
    private MockSystemInput mockSystemInput;

    @Before
    public void initObjects() {
        inputAndOutput = new InputAndOutput();
        mockSystemInput = new MockSystemInput();
    }

    @Test
    public void inputShouldGetString() {
        mockSystemInput.set("2 3 5");
        String input = inputAndOutput.getInput(mockSystemInput);
        assertThat(input, is("2 3 5"));
    }

    @Test
    public void ouputShouldReturnString() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String separator = System.getProperty("line.separator");
        inputAndOutput.printOutput("FizzBuzzWhizz");
        assertThat(output.toString(), is("FizzBuzzWhizz"+separator));
    }
} 

class MockSystemInput implements KeyboardInput{
    private String input;
    
    public void set(String s){
        input = s;
    }
    public String get(){
        return input;
    }
}
    
