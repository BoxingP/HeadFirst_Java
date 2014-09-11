package com.boxing.rule;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReplaceContainTest {
    private Replace replace;

    @Before
    public void initObject() throws Exception {
        Properties config = new Properties();
        InputStream in = this.getClass().getResourceAsStream("/fizz.properties");
        config.load(in);
        in.close();
        String[] containDefinedString = config.getProperty("value.contain.definedString").split(",");
        replace = new ReplaceContain(containDefinedString);
    }

    @Test
    public void inputContainTheFirstDefinedNumberShouldReturnFizz() {
        assertThat(replace.replace(32, new int[] {2, 3, 4, 5}), is("Fizz"));
    }

    @Test
    public void inputContainTheSecondDefinedNumberExceptTheFirstShouldReturnWhizz() {
        assertThat(replace.replace(31, new int[] {2, 3, 4, 5}), is("Whizz"));
    }

    @Test
    public void inputContainTheThirdDefinedNumberExceptTheFirstAndSecondShouldReturnBuzz() {
        assertThat(replace.replace(41, new int[] {2, 3, 4, 5}), is("Buzz"));
    }
}
