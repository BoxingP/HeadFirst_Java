package com.boxing.fizz;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class InputAndOutputTest {
    
    private InputAndOutput inputAndOutput;

    @Before
    public void initObjects() {
        inputAndOutput = new InputAndOutput();
    }

    @Test
    public void inputShouldGetString() {
        ByteArrayInputStream inputString = new ByteArrayInputStream("2 3 5".getBytes());
        System.setIn(inputString);
        String input = inputAndOutput.getInput();
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
