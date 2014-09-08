package com.boxing.fizzBuzzWhizz;

import java.io.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzWhizzTest {
    private ByteArrayOutputStream output;

    @Before
    public void init() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testNumberWithCorrectDefinedNumbersShouldReturnCorrectString() {
        FizzBuzzWhizz.main(new String[] {"2", "3", "5"});
        String[] outputList = output.toString().split("\\n");
        int testNumber = 15;
        assertThat(outputList[testNumber-1], is("Buzz"));
    }

}

