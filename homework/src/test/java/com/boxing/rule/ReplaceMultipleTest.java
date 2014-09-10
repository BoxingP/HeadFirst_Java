package com.boxing.rule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.runners.Parameterized.*;

public class ReplaceMultipleTest {

    @RunWith(Parameterized.class)
    public static class ReplaceOnlyOneDefinedNumberMultipleTest {
        @Parameters
        public static Collection createInputIsOnlyMultipleOfOneDefinedNumber() {
            return Arrays.asList(new Object[][] {
                    {9, "Fizz"},
                    {16, "Buzz"},
                    {91, "Whizz"},
                    {25, "Murmur"}
            });
        }

        @Parameter(0)
        public int inputIsOnlyMultipleOfOneDefinedNumber;

        @Parameter(1)
        public String oneMultipleTag;

        @Test
        public void inputIsOnlyMultipleOfOneDefinedNumberShouldReturnOneWord() {
            Replace replace = new ReplaceMultiple();
            assertThat(replace.replace(inputIsOnlyMultipleOfOneDefinedNumber, new int[] {3, 4, 7, 5}), is(oneMultipleTag));
        }
    }

    @RunWith(Parameterized.class)
    public static class ReplaceTwoDefinedNumbersMultipleTest {
        @Parameters
        public static Collection createInputIsMultipleOfTwoDefinedNumbers() {
            return Arrays.asList(new Object[][] {
                    {12, "FizzBuzz"},
                    {21, "FizzWhizz"},
                    {15, "FizzMurmur"},
                    {28, "BuzzWhizz"},
                    {20, "BuzzMurmur"},
                    {595, "WhizzMurmur"}
            });
        }

        @Parameter(0)
        public int inputIsMultipleOfTwoDefinedNumbers;

        @Parameter(1)
        public String twoMultipleTag;

        @Test
        public void inputIsMultipleOfTwoDefinedNumbersShouldReturnTwoWords() {
            Replace replace = new ReplaceMultiple();
            assertThat(replace.replace(inputIsMultipleOfTwoDefinedNumbers, new int[] {3, 4, 7, 5}), is(twoMultipleTag));
        }
    }

    @RunWith(Parameterized.class)
    public static class ReplaceThreeDefinedNumbersMultipleTest {
        @Parameters
        public static Collection createInputIsMultipleOfThreeDefinedNumbers() {
            return Arrays.asList(new Object[][] {
                    {280, "BuzzWhizzMurmur"},
                    {105, "FizzWhizzMurmur"},
                    {60, "FizzBuzzMurmur"},
                    {168, "FizzBuzzWhizz"}
            });
        }

        @Parameter(0)
        public int inputIsMultipleOfThreeDefinedNumbers;

        @Parameter(1)
        public String threeMultipleTag;

        @Test
        public void inputIsMultipleOfThreeDefinedNumbersShouldReturnThreeWords() {
            Replace replace = new ReplaceMultiple();
            assertThat(replace.replace(inputIsMultipleOfThreeDefinedNumbers, new int[] {3, 4, 7, 5}), is(threeMultipleTag));
        }
    }

    @Test
    public void inputIsMultipleOfFourDefinedNumbersShouldReturnBingo() {
        Replace replace = new ReplaceMultiple();
        assertThat(replace.replace(1260, new int[] {3, 4, 7, 5}), is("Bingo"));
    }

    @Test
    public void inputNotMultipleOfAnyDefinedNumberShouldReturnItself() {
        Replace replace = new ReplaceMultiple();
        assertThat(replace.replace(11, new int[] {3, 4, 7, 5}), is("11"));
    }
}