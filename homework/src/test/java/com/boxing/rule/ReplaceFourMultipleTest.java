package com.boxing.rule;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReplaceFourMultipleTest {
    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFourShouldReturnBingo() {
        ReplaceFourMultiple replaceFourMultiple = new ReplaceFourMultiple();
        assertThat(replaceFourMultiple.replace(1260, new int[] {3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFiveShouldReturnItself() {
        ReplaceFourMultiple replaceFourMultiple = new ReplaceFourMultiple();
        assertThat(replaceFourMultiple.replace(1260, new int[] {3, 4, 7, 5, 9}), is("1260"));
    }
}
