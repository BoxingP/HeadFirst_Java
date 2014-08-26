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
    public void specialNumberShouldBeLimitedDifferentDigit() {
        assertThat(validator.isValid(new int[]{2,3,5,7}), is(true));
    } 
    
    @Test
    public void specialNumberIsEmptyShouldReturnFalse() {
        assertThat(validator.isValid(new int[]{}), is(false));
    }

    @Test
    public void specialNumberNotCorrespondingAmountShouldReturnFalse() {
        assertThat(validator.isValid(new int[]{2,3,5}), is(false));
    }
    
    @Test
    public void specialNumberNotDigitShouldReturnFalse() {
        assertThat(validator.isValid(new int[]{1,12,123,1234}), is(false));
    }
    
    @Test
    public void specialNumberNotDifferentShouldReturnFalse() {
        assertThat(validator.isValid(new int[]{2,3,5,5}), is(false));
    }

}
