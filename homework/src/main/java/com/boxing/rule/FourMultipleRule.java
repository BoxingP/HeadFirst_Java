package com.boxing.rule;

public class FourMultipleRule extends Rule {
    private String multipleFourSpecialString;

    public FourMultipleRule(String[] multipleFourSpecialString) {
        this.multipleFourSpecialString = multipleFourSpecialString[0];
    }

    public String replace(int number, int[] specialNumbers) {
        if (specialNumbers.length == 4) {
            for (int specialNumber : specialNumbers) {
                if (number % specialNumber != 0) break;
                return multipleFourSpecialString;
            }
        }
        return doNext(number, specialNumbers);
    }

}
