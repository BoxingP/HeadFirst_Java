package com.boxing.rule;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ReturnNumberRuleTest {
    @Test
    public void eleven_shouldReturn_eleven() {
        assertThat(new ReturnNumberRule().replace(11, null), is("11"));
    }
}
