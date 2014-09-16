package com.boxing.rule;

public class ReplaceFourMultiple extends Replace{
    private String multipleFourDefinedString;

    public ReplaceFourMultiple(String[] multipleFourDefinedString){
        this.multipleFourDefinedString = multipleFourDefinedString[0];
    }

    public String replace(int number, int[] specialNumbers) {
        if (specialNumbers.length==4) {
            for (int definedNumber : specialNumbers) {
                if (number % definedNumber != 0) break;
                return multipleFourDefinedString;
            }
        }
        return doNext(number, specialNumbers);
    }

}
