package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReplaceContainTest {
    private Replace replace;

    @Before
    public void initObject() throws Exception {
        String[] containDefinedString = new String[] {"Fizz","Whizz","Buzz"};
        replace = new ReplaceContain(containDefinedString);
    }

    @Test
    public void inputContainTheFirstDefinedNumberShouldReturnFizz() {
        assertThat(replace.replace(32, new int[] {2, 3, 4, 5}), is("Fizz"));
    }

    @Test
    public void inputContainTheSecondDefinedNumberExceptTheFirstShouldReturnWhizz() {
        assertThat(replace.replace(31, new int[] {2, 3, 4, 5}), is("Whizz"));
    }

    @Test
    public void inputContainTheThirdDefinedNumberExceptTheFirstAndSecondShouldReturnBuzz() {
        assertThat(replace.replace(41, new int[] {2, 3, 4, 5}), is("Buzz"));
    }

    @Test
    public void inputNotContainTheDefinedNumberAndNextIsNullShouldReturnItself() {
        assertThat(replace.replace(51, new int[] {2, 3, 4, 5}), is("51"));
    }

    @Test
    public void inputNotContainTheDefinedNumberAndNextIsNotNullShouldReturnNext() {
        Replace next=new Replace() {
            @Override
            public void setNext(Replace replace) {
            }

            @Override
            public String replace(int number, int[] definedNumbers) {
                return "Next";
            }
        };
        replace.setNext(next);
        assertThat(replace.replace(51, new int[]{2, 3, 4, 5}), is("Next"));
    }
}
