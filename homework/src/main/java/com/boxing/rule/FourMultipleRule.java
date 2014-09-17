package com.boxing.rule;

public class FourMultipleRule extends Rule {
    private String multipleFourDefinedString;

    public FourMultipleRule(String[] multipleFourDefinedString) {
        this.multipleFourDefinedString = multipleFourDefinedString[0];
    }

    public String rule(int number, int[] specialNumbers) {
        if (specialNumbers.length == 4) {
            for (int definedNumber : specialNumbers) {
                if (number % definedNumber != 0) break;
                return multipleFourDefinedString;
            }
        }
        return doNext(number, specialNumbers);
    }

}
