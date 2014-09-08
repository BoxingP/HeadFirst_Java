package com.boxing.fizzBuzzWhizzMurmur;

import java.io.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzWhizzMurmurTest {
    private ByteArrayOutputStream output;

    @Before
    public void init() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testNumberWithCorrectDefinedNumbersShouldReturnCorrectString() {
        FizzBuzzWhizzMurmur.main(new String[] {"2", "3", "4", "5"});
        String[] outputList = output.toString().split("\\n");
        int testNumber = 55;
        assertThat(outputList[testNumber-1], is("Murmur"));
    }

}

