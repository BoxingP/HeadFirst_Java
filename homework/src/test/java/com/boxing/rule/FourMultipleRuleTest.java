package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FourMultipleRuleTest {
    private Rule rule;

    @Before
    public void initObject() {
        rule = new FourMultipleRule(new String[]{"Bingo"});
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFourShouldReturnBingo() {
        assertThat(rule.rule(420, new int[]{3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputIsNotCommonMultipleOfDefinedNumbersAmountIsFourShouldReturnItself() {
        assertThat(rule.rule(84, new int[]{3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputIsCommonMultipleOfDefinedNumbersAmountIsFiveShouldReturnNext() {
        Rule next=new Rule() {
            @Override
            public String rule(int number, int[] specialNumbers) {
                return "Next";
            }
        };
        rule.setNext(next);
        assertThat(rule.rule(1260, new int[]{3, 4, 7, 5, 9}), is("Next"));
    }
}
