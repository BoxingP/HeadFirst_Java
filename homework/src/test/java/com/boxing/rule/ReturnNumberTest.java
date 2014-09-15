package com.boxing.rule;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ReturnNumberTest {
    @Test
    public void inputNumberShouldReturnItself() {
        assertThat(new ReturnNumber().replace(11, null), is("11"));
    }
}
