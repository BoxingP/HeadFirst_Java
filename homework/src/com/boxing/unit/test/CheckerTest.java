package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckerTest {

    @Test
    public void specialNumberShouldBeLimitedDifferentDigit() {
        assertThat(new Checker(new int[]{2,3,5,7}, 4).check(), is(true));
    } 
    
    @Test
    public void specialNumberIsEmptyShouldReturnFalse() {
        assertThat(new Checker(new int[]{}, 4).check(), is(false));
    }

    @Test
    public void specialNumberNotCorrespondingAmountShouldReturnFalse() {
        assertThat(new Checker(new int[]{2,3,5}, 4).check(), is(false));
    }
    
    @Test
    public void specialNumberNotDigitShouldReturnFalse() {
        assertThat(new Checker(new int[]{1,12,123,1234}, 4).check(), is(false));
    }
    
    @Test
    public void specialNumberNotDifferentShouldReturnFalse() {
        assertThat(new Checker(new int[]{2,3,5,5}, 4).check(), is(false));
    }

}
