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
        changer = new Changer(new int[] {2,3,5,7});
    }

    @Parameters(name = "{index}")
    public static Collection createValue() {
        return Arrays.asList(new Object[][] {
                {12, "Fizz"},
                {4, "Fizz"},
                {9, "Buzz"},
                {5, "Whizz"},
                {49, "Murmur"},
                {6, "FizzBuzz"},
                {10, "FizzWhizz"},
                {14, "FizzMurmur"},
                {15, "BuzzWhizz"},
                {63, "BuzzMurmur"},
                {35, "WhizzMurmur"},
                {105, "BuzzWhizzMurmur"},
                {70, "FizzWhizzMurmur"},
                {84, "FizzBuzzMurmur"},
                {30, "FizzBuzzWhizz"},
                {630, "FizzBuzzWhizzMurmur"},
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
