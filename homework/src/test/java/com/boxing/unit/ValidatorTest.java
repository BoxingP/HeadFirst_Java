package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValidatorTest {
    Validator validator;

    @Before
    public void initObjects() {
        validator = new Validator(4);
    }

    @Test
    public void differentDigits_shouldReturn_true() {
        assertThat(validator.isValid(new int[]{2, 3, 5, 7}), is(true));
    }

    @Test
    public void empty_shouldReturn_false() {
        assertThat(validator.isValid(new int[]{}), is(false));
    }

    @Test
    public void nonCorrespondingAmount_shouldReturn_false() {
        assertThat(validator.isValid(new int[]{2, 3, 5}), is(false));
    }

    @Test
    public void belowDigit_shouldReturn_alse() {
        assertThat(validator.isValid(new int[]{-1, 1, 12, 123}), is(false));
    }

    @Test
    public void overDigit_shouldReturn_false() {
        assertThat(validator.isValid(new int[]{1, 10, 12, 123}), is(false));
    }

    @Test
    public void repeatingDigits_shouldReturn_false() {
        assertThat(validator.isValid(new int[]{2, 3, 5, 5}), is(false));
    }

}
