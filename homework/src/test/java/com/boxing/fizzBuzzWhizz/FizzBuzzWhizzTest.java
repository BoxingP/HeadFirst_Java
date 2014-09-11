package com.boxing.fizzBuzzWhizz;

import java.io.*;

import org.apache.commons.configuration.PropertiesConfiguration;
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
    public void testNumberWithDefinedNumbersAmountIsThreeShouldReturnCorrectString() throws Exception{
        System.setProperty("name","fizz");
        String[] args = new String[] {"2","3","5"};
        FizzBuzzWhizz.main(args);
        String[] outputList = output.toString().split("\\n");
        int testNumber = 15;
        assertThat(outputList[testNumber-1], is("Buzz"));
    }

    @Test
    public void testNumberWithDefinedNumbersAmountIsFourShouldReturnCorrectString() throws Exception{
        System.setProperty("name","fizzMuMu");
        String[] args = new String[] {"2","3","5","7"};
        FizzBuzzWhizz.main(args);
        String[] outputList = output.toString().split("\\n");
        int testNumber = 15;
        assertThat(outputList[testNumber-1], is("Buzz"));
    }

}

