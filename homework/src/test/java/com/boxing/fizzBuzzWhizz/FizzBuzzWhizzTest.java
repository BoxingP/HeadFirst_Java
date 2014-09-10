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
    public void testNumberWithCorrectDefinedNumbersShouldReturnCorrectString() throws Exception{
        PropertiesConfiguration config = new PropertiesConfiguration("config.properties");
        config.setProperty("amount.definedNumbers", 3);
        config.setProperty("value.args", "2,3,5");
        config.save();
        String[] args = config.getStringArray("value.args");
        FizzBuzzWhizz.main(args);
        String[] outputList = output.toString().split("\\n");
        int testNumber = 15;
        assertThat(outputList[testNumber-1], is("Buzz"));
    }

}

