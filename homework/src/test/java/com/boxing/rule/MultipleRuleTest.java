package com.boxing.rule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.runners.Parameterized.*;

public class MultipleRuleTest {
    private String[] multipleSpecialString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
    private Rule rule = new MultipleRule(multipleSpecialString);

    @RunWith(Parameterized.class)
    public static class ReplaceOnlyOneSpecialNumberMultipleTest {
        String[] multipleSpecialString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
        Rule rule = new MultipleRule(multipleSpecialString);

        @Parameters
        public static Collection createInputIsOnlyMultipleOfOneSpecialNumber() {
            return Arrays.asList(new Object[][]{
                    {9, "Fizz"},
                    {16, "Buzz"},
                    {91, "Whizz"},
                    {25, "Murmur"}
            });
        }

        @Parameter(0)
        public int inputIsOnlyMultipleOfOneSpecialNumber;

        @Parameter(1)
        public String oneMultipleTag;

        @Test
        public void multipleOfOneSpecialNumber_shouldReturn_oneWord() {
            assertThat(rule.replace(inputIsOnlyMultipleOfOneSpecialNumber, new int[]{3, 4, 7, 5}), is(oneMultipleTag));
        }
    }

    @RunWith(Parameterized.class)
    public static class ReplaceTwoSpecialNumbersMultipleTest {
        String[] multipleSpecialString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
        Rule rule = new MultipleRule(multipleSpecialString);

        @Parameters
        public static Collection createInputIsMultipleOfTwoSpecialNumbers() {
            return Arrays.asList(new Object[][]{
                    {12, "FizzBuzz"},
                    {21, "FizzWhizz"},
                    {15, "FizzMurmur"},
                    {28, "BuzzWhizz"},
                    {20, "BuzzMurmur"},
                    {595, "WhizzMurmur"}
            });
        }

        @Parameter(0)
        public int inputIsMultipleOfTwoSpecialNumbers;

        @Parameter(1)
        public String twoMultipleTag;

        @Test
        public void multipleOfTwoSpecialNumbers_shouldReturn_twoWords() {
            assertThat(rule.replace(inputIsMultipleOfTwoSpecialNumbers, new int[]{3, 4, 7, 5}), is(twoMultipleTag));
        }
    }

    @RunWith(Parameterized.class)
    public static class ReplaceThreeSpecialNumbersMultipleTest {
        String[] multipleSpecialString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
        Rule rule = new MultipleRule(multipleSpecialString);

        @Parameters
        public static Collection createInputIsMultipleOfThreeSpecialNumbers() {
            return Arrays.asList(new Object[][]{
                    {280, "BuzzWhizzMurmur"},
                    {105, "FizzWhizzMurmur"},
                    {60, "FizzBuzzMurmur"},
                    {168, "FizzBuzzWhizz"}
            });
        }

        @Parameter(0)
        public int inputIsMultipleOfThreeSpecialNumbers;

        @Parameter(1)
        public String threeMultipleTag;

        @Test
        public void multipleOfThreeSpecialNumbers_shouldReturn_threeWords() {
            assertThat(rule.replace(inputIsMultipleOfThreeSpecialNumbers, new int[]{3, 4, 7, 5}), is(threeMultipleTag));
        }
    }

    @Test
    public void input1260_shouldReturn_fizzBuzzWhizzMurmur() {
        assertThat(rule.replace(1260, new int[]{3, 4, 7, 5}), is("FizzBuzzWhizzMurmur"));
    }

    @Test
    public void eleven_shouldGoTo_nextRule() {
        Rule next = new Rule() {
            @Override
            public String replace(int number, int[] specialNumbers) {
                return "Next";
            }
        };
        rule.setNext(next);
        assertThat(rule.replace(11, new int[]{3, 4, 7, 5}), is("Next"));
    }
}