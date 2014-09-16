package com.boxing.fizzBuzzWhizz;

import java.io.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
        System.setProperty("name", "fizz");
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

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void definedNumbersContainNonNumericShouldThrowsAnException() throws Exception{
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("Only number is allowed!");
        System.setProperty("name","fizzMuMu");
        String[] args = new String[] {"2","3a","5","7"};
        FizzBuzzWhizz.main(args);
    }

    @Test
    public void definedNumbersContainRepeatingDigitShouldThrowsAnException() throws Exception{
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Only non repeating digits are allowed!");
        System.setProperty("name","fizzMuMu");
        String[] args = new String[] {"2","2","5","7"};
        FizzBuzzWhizz.main(args);
    }

    @Test
    public void definedNumbersContainNonDigitShouldThrowsAnException() throws Exception{
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Only non repeating digits are allowed!");
        System.setProperty("name","fizzMuMu");
        String[] args = new String[] {"2","31","5","7"};
        FizzBuzzWhizz.main(args);
    }
}

