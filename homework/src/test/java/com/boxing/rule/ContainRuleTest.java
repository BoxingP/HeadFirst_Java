package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContainRuleTest {
    private Rule rule;

    @Before
    public void initObject() throws Exception {
        String[] containDefinedString = new String[]{"Fizz", "Whizz", "Buzz"};
        rule = new ContainRule(containDefinedString);
    }

    @Test
    public void inputContainTheFirstDefinedNumberShouldReturnFizz() {
        assertThat(rule.replace(32, new int[]{2, 3, 4, 5}), is("Fizz"));
    }

    @Test
    public void inputContainTheSecondDefinedNumberExceptTheFirstShouldReturnWhizz() {
        assertThat(rule.replace(31, new int[]{2, 3, 4, 5}), is("Whizz"));
    }

    @Test
    public void inputContainTheThirdDefinedNumberExceptTheFirstAndSecondShouldReturnBuzz() {
        assertThat(rule.replace(41, new int[]{2, 3, 4, 5}), is("Buzz"));
    }

    @Test
    public void inputNotContainTheDefinedNumberShouldReturnNext() {
        Rule next = new Rule() {
            @Override
            public String replace(int number, int[] specialNumbers) {
                return "Next";
            }
        };
        rule.setNext(next);
        assertThat(rule.replace(51, new int[]{2, 3, 4, 5}), is("Next"));
    }
}
