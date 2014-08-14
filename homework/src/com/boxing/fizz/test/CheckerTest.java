package com.boxing.fizz;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckerTest {
    
    @Test
    public void specialNumberShouldBeFourDifferentDigit() {
        assertThat(new Checker(new int[]{2,3,5,7}).check(), is(true));
    } 
    
    @Test
    public void specialNumberIsEmptyShouldReturnFalse() {
        assertThat(new Checker(new int[]{}).check(), is(false));
    }

    @Test
    public void specialNumberNotDigitShouldReturnFalse() {
        assertThat(new Checker(new int[]{1,12,123,1234}).check(), is(false));
    }
    
    @Test
    public void specialNumberNotDifferentShouldReturnFalse() {
        assertThat(new Checker(new int[]{2,3,5,5}).check(), is(false));
    }

}
