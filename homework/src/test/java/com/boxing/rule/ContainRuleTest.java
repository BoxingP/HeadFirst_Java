package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContainRuleTest {
    private Rule rule;

    @Before
    public void initObject() throws Exception {
        String[] containDefinedString = new String[] {"Fizz","Whizz","Buzz"};
        rule = new ContainRule(containDefinedString);
    }

    @Test
    public void inputContainTheFirstDefinedNumberShouldReturnFizz() {
        assertThat(rule.rule(32, new int[]{2, 3, 4, 5}), is("Fizz"));
    }

    @Test
    public void inputContainTheSecondDefinedNumberExceptTheFirstShouldReturnWhizz() {
        assertThat(rule.rule(31, new int[]{2, 3, 4, 5}), is("Whizz"));
    }

    @Test
    public void inputContainTheThirdDefinedNumberExceptTheFirstAndSecondShouldReturnBuzz() {
        assertThat(rule.rule(41, new int[]{2, 3, 4, 5}), is("Buzz"));
    }

    @Test
    public void inputNotContainTheDefinedNumberShouldReturnNext() {
        Rule next=new Rule() {
            @Override
            public String rule(int number, int[] specialNumbers) {
                return "Next";
            }
        };
        rule.setNext(next);
        assertThat(rule.rule(51, new int[]{2, 3, 4, 5}), is("Next"));
    }
}
