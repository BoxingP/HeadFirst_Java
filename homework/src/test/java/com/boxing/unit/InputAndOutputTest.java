package com.boxing.unit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void resultIsFizzBuzzWhizz_shouldReturn_fizzBuzzWhizz() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String separator = System.getProperty("line.separator");
        inputAndOutput.printOutput("FizzBuzzWhizz");
        assertThat(output.toString(), is("FizzBuzzWhizz" + separator));
    }
} 
