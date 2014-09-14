package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReplaceFourMultipleTest {
    private Replace replace;

    @Before
    public void initObject() {
        replace = new ReplaceFourMultiple(new String[]{"Bingo"});
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFourShouldReturnBingo() {
        assertThat(replace.replace(420, new int[] {3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputIsNotCommonMultipleOfDefinedNumbersAmountIsFourShouldReturnItself() {
        assertThat(replace.replace(84, new int[] {3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFiveAndNextIsNullShouldReturnItself() {
        assertThat(replace.replace(1260, new int[] {3, 4, 7, 5, 9}), is("1260"));
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFiveAndNextIsNOtNullShouldReturnNext() {
        Replace next=new Replace() {
            @Override
            public String replace(int number, int[] definedNumbers) {
                return "Next";
            }
        };
        replace.setNext(next);
        assertThat(replace.replace(1260, new int[] {3, 4, 7, 5, 9}), is("Next"));
    }
}
