package com.boxing.unit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class OutputTest {

    private Output output;

    @Before
    public void initObjects() {
        output = new Output();
    }

    @Test
    public void resultIsFizzBuzzWhizz_shouldReturn_fizzBuzzWhizz() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String separator = System.getProperty("line.separator");
        this.output.printOutput("FizzBuzzWhizz");
        assertThat(output.toString(), is("FizzBuzzWhizz" + separator));
    }
} 
