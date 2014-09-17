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
    private String[] multipleDefinedString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
    private Rule rule = new MultipleRule(multipleDefinedString);

    @RunWith(Parameterized.class)
    public static class ReplaceOnlyOneDefinedNumberMultipleTest {
        String[] multipleDefinedString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
        Rule rule = new MultipleRule(multipleDefinedString);

        @Parameters
        public static Collection createInputIsOnlyMultipleOfOneDefinedNumber() {
            return Arrays.asList(new Object[][]{
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
            assertThat(rule.replace(inputIsOnlyMultipleOfOneDefinedNumber, new int[]{3, 4, 7, 5}), is(oneMultipleTag));
        }
    }

    @RunWith(Parameterized.class)
    public static class ReplaceTwoDefinedNumbersMultipleTest {
        String[] multipleDefinedString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
        Rule rule = new MultipleRule(multipleDefinedString);

        @Parameters
        public static Collection createInputIsMultipleOfTwoDefinedNumbers() {
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
        public int inputIsMultipleOfTwoDefinedNumbers;

        @Parameter(1)
        public String twoMultipleTag;

        @Test
        public void inputIsMultipleOfTwoDefinedNumbersShouldReturnTwoWords() {
            assertThat(rule.replace(inputIsMultipleOfTwoDefinedNumbers, new int[]{3, 4, 7, 5}), is(twoMultipleTag));
        }
    }

    @RunWith(Parameterized.class)
    public static class ReplaceThreeDefinedNumbersMultipleTest {
        String[] multipleDefinedString = new String[]{"Fizz", "Buzz", "Whizz", "Murmur"};
        Rule rule = new MultipleRule(multipleDefinedString);

        @Parameters
        public static Collection createInputIsMultipleOfThreeDefinedNumbers() {
            return Arrays.asList(new Object[][]{
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
            assertThat(rule.replace(inputIsMultipleOfThreeDefinedNumbers, new int[]{3, 4, 7, 5}), is(threeMultipleTag));
        }
    }

    @Test
    public void inputIsMultipleOfFourDefinedNumbersShouldReturnFizzBuzzWhizzMurmur() {
        assertThat(rule.replace(1260, new int[]{3, 4, 7, 5}), is("FizzBuzzWhizzMurmur"));
    }

    @Test
    public void inputNotMultipleOfAnyDefinedNumberShouldReturnNext() {
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