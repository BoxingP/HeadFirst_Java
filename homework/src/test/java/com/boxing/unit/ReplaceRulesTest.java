package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ReplaceRulesTest {
    private int[] definedNumbers;
    private Replace ruleWhichReturnZz;
    private Replace ruleWhichReturnAa;
    private Replace ruleWhichReturnNumber;


    @Before
    public void initObject() {
        definedNumbers = new int[] {};
        ruleWhichReturnZz = new Replace() {
            @Override
            public String replace(int number, int[] definedNumbers) {
                return "zz";
            }
        };
        ruleWhichReturnAa = new Replace() {
            @Override
            public String replace(int number, int[] definedNumbers) {
                return "aa";
            }
        };
        ruleWhichReturnNumber = new Replace() {
            @Override
            public String replace(int number, int[] definedNumbers) {
                return "22";
            }
        };

    }

    @Test
    public void thereIsOnlyOneRuleThatWillReturnZzThenRuleShouldReturnZz() {
        ReplaceRules rules = new ReplaceRules( Arrays.asList(ruleWhichReturnZz) );
        assertThat(rules.rule(44, definedNumbers), is("zz"));
    }

    @Test
    public void thereIsTwoRulesThatTheFirstWillReturnZzThenRuleShouldReturnZz() {
        ReplaceRules rules = new ReplaceRules( Arrays.asList(ruleWhichReturnZz,ruleWhichReturnAa) );
        assertThat(rules.rule(44, definedNumbers), is("zz"));
    }

    @Test
    public void thereIsTwoRulesThatTheFirstWillReturnNumberAndTheSecondWillReturnAaThenRuleShouldReturnAa() {
        ReplaceRules rules = new ReplaceRules( Arrays.asList(ruleWhichReturnNumber,ruleWhichReturnAa) );
        assertThat(rules.rule(44, definedNumbers), is("aa"));
    }

    @Test
    public void thereIsTwoRulesThatBothWillReturnNumberThenRuleShouldReturnNumber() {
        ReplaceRules rules = new ReplaceRules( Arrays.asList(ruleWhichReturnNumber,ruleWhichReturnNumber) );
        assertThat(rules.rule(44, definedNumbers), is("22"));
    }
}

