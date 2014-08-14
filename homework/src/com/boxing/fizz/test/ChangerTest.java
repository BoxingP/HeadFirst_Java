package com.boxing.fizz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangerTest {

    @Test
    public void numberContainsTheFirstShouldReturnFizz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(12), is("Fizz"));
    }

    @Test
    public void numberIsMultipleOfTheFirstShouldReturnFizz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(4), is("Fizz"));
    }

    @Test
    public void numberIsMultipleOfTheSecondShouldReturnBuzz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(9), is("Buzz"));
    }

    @Test
    public void numberIsMultipleOfTheThirdShouldReturnWhizz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(5), is("Whizz"));
    }
    
    @Test
    public void numberIsMultipleOfTheFourthShouldReturnMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(49), is("Murmur"));
    }
    
    @Test
    public void numberIsMultipleOfTheFirstAndSecondShouldReturnFizzBuzz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(6), is("FizzBuzz"));
    }

    @Test
    public void numberIsMultipleOfTheFirstAndThirdShouldReturnFizzWhizz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(10), is("FizzWhizz"));
    }
    
    @Test
    public void numberIsMultipleOfTheFirstAndFourthShouldReturnFizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(14), is("FizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfTheSecondAndThirdShouldReturnBuzzWhizz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(15), is("BuzzWhizz"));
    }

    @Test
    public void numberIsMultipleOfTheSecondAndFourthShouldReturnBuzzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(63), is("BuzzMurmur"));
    }
    
    @Test
    public void numberIsMultipleOfTheThirdAndFourthShouldReturnWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(35), is("WhizzMurmur"));
    }
    
    @Test
    public void numberIsMultipleOfAllExceptFirstShouldReturnBuzzWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(105), is("BuzzWhizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfAllExceptSecondShouldReturnFizzWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(70), is("FizzWhizzMurmur"));
    }

    @Test
    public void numberIsMultipleOfAllExceptThirdShouldReturnFizzBuzzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(84), is("FizzBuzzMurmur"));
    }

    @Test
    public void numberIsMultipleOfAllExceptFourthShouldReturnFizzBuzzWhizz() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(30), is("FizzBuzzWhizz"));
    }

    @Test
    public void numberIsMultipleOfAllShouldReturnFizzBuzzWhizzMurmur() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(630), is("FizzBuzzWhizzMurmur"));
    }   

    @Test
    public void numberNotRelateToAnyShouldReturnItself() {
        assertThat(new Changer(new int[] {2,3,5,7}).change(11), is("11"));
    }

}
