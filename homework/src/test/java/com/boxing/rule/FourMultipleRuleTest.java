package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FourMultipleRuleTest {
    private Rule rule;
    private Rule next = new Rule() {
        @Override
        public String replace(int number, int[] specialNumbers) {
            return "Next";
        }
    };

    @Before
    public void initObject() {
        rule = new FourMultipleRule("Bingo");
    }

    @Test
    public void input420WithFourSpecialNumbers_shouldReturn_bingo() {
        assertThat(rule.replace(420, new int[]{3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void input84WithFourSpecialNumbers_shouldGoTo_nextRule() {
        rule.setNext(next);
        assertThat(rule.replace(84, new int[]{3, 4, 7, 5}), is("Next"));
    }
}
