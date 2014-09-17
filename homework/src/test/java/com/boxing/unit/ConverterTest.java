package com.boxing.unit;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    Converter converter;

    @Before
    public void initObject() {
        converter = new Converter();
    }

    @Test
    public void inputElementsIsNumbersShouldBeConvertedCorrectly() {
        assertThat(converter.convert(new String[]{"2", "3", "4"}), is(new int[]{2, 3, 4}));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void inputStringContainsOthersShouldThrowsException() {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("Only number is allowed!");
        converter.convert(new String[]{"2", "3a", "4"});
    }

}
