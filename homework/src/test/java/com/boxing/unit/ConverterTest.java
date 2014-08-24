package com.boxing.unit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    
    @Test
    public void inputElementsIsNumbersShouldBeConvertedCorrectly() {
        assertThat (new Converter(new String[]{"2", "3", "4"}).convert(), is(new int[]{2,3,4}));
    }
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void inputStringContainsOthersShouldThrowsException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Only number is allowed!");
        new Converter(new String[]{"2","3a","4"}).convert();
    }

}
