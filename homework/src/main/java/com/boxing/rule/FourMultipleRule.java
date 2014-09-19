package com.boxing.rule;

public class FourMultipleRule extends Rule {
    private String multipleFourSpecialString;

    public FourMultipleRule(String multipleFourSpecialString) {
        this.multipleFourSpecialString = multipleFourSpecialString;
    }

    public String replace(int number, int[] specialNumbers) {
        return isCommonMultiple(number, specialNumbers) ? multipleFourSpecialString:doNext(number, specialNumbers);
    }

    private boolean isCommonMultiple(int number, int[] specialNumbers) {
        for (int specialNumber:specialNumbers) {
            if (number % specialNumber != 0) return false;
        }
        return true;
    }
}
