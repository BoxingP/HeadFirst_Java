package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckerTest {
    Checker checker;

    @Before
    public void initObjects() {
        checker = new Checker(4);
    }

    @Test
    public void specialNumberShouldBeLimitedDifferentDigit() {
        assertThat(checker.check(new int[]{2,3,5,7}), is(true));
    } 
    
    @Test
    public void specialNumberIsEmptyShouldReturnFalse() {
        assertThat(checker.check(new int[]{}), is(false));
    }

    @Test
    public void specialNumberNotCorrespondingAmountShouldReturnFalse() {
        assertThat(checker.check(new int[]{2,3,5}), is(false));
    }
    
    @Test
    public void specialNumberNotDigitShouldReturnFalse() {
        assertThat(checker.check(new int[]{1,12,123,1234}), is(false));
    }
    
    @Test
    public void specialNumberNotDifferentShouldReturnFalse() {
        assertThat(checker.check(new int[]{2,3,5,5}), is(false));
    }

}
