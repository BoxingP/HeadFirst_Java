package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReplaceFourMultipleTest {
    private ReplaceFourMultiple replaceFourMultiple;

    @Before
    public void initObject() {
        replaceFourMultiple = new ReplaceFourMultiple("Bingo");
    }
    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFourShouldReturnBingo() {
        assertThat(replaceFourMultiple.replace(1260, new int[] {3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFiveShouldReturnItself() {
        assertThat(replaceFourMultiple.replace(1260, new int[] {3, 4, 7, 5, 9}), is("1260"));
    }
}
