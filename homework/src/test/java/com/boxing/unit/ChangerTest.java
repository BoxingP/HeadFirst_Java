package com.boxing.unit;

import com.boxing.rule.Replace;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangerTest {
    private int[] definedNumbers = new int[] {};
    private Replace replace = new Replace() {
        @Override
        public String replace(int number, int[] definedNumbers) {
            return null;
        }
    };
    private ReplaceRules replaceRules;

    @Before
    public void initObject() {
        replaceRules = new ReplaceRules(Arrays.asList(replace)) {
            @Override
            public String rule(int number, int[] definedNumbers) {
                return "aa";
            }
        };
    }

    @Test
    public void whenRaplaceRulesDefinedReturnAaThenChangeShouldReturnAa() {
        Changer changer = new Changer(definedNumbers, replaceRules);
        assertThat(changer.change(44), is("aa"));
    }
}
