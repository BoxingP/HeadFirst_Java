package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContainRuleTest {
    private Rule rule;

    @Before
    public void initObject() throws Exception {
        String containSpecialString = "Fizz";
        rule = new ContainRule(containSpecialString,0);
    }

    @Test
    public void thirtyTwo_shouldReturn_fizz() {
        assertThat(rule.replace(32, new int[]{2, 3, 4, 5}), is("Fizz"));
    }

    @Test
    public void fiftyOne_shouldGoTo_nextRule() {
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
