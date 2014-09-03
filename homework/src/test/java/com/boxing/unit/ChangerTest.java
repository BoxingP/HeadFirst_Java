package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class ChangerTest {
    private Changer changer;
    
    @Before
    public void initObject() {
        changer = new Changer(new int[] {3,4,7,5});
    }

    @Parameters(name = "{index}")
    public static Collection createValue() {
        return Arrays.asList(new Object[][] {
                {3, "Fizz"},
                {4, "Whizz"},
                {7, "Buzz"},
                {9, "Fizz"},
                {16, "Buzz"},
                {91, "Whizz"},
                {25, "Murmur"},
                {12, "FizzBuzz"},
                {21, "FizzWhizz"},
                {15, "FizzMurmur"},
                {28, "BuzzWhizz"},
                {20, "BuzzMurmur"},
                {595, "WhizzMurmur"},
                {280, "BuzzWhizzMurmur"},
                {105, "FizzWhizzMurmur"},
                {60, "FizzBuzzMurmur"},
                {168, "FizzBuzzWhizz"},
                {1680, "FizzBuzzWhizzMurmur"},
                {11, "11"}});
    }

    @Parameter(0)
    public int testNumber;
    
    @Parameter(1)
    public String multipleTag;

    @Test
    public void testNumberDifferentConditionsShouldReturnCorrectly() {
        assertThat(changer.change(testNumber), is(multipleTag));
    }

}
