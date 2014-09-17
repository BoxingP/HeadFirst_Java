package com.boxing.rule;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LastRuleTest {
    @Test
    public void inputNumberShouldReturnItself() {
        assertThat(new LastRule().replace(11, null), is("11"));
    }
}
