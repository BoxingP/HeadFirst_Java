package com.boxing.rule;

public class MultipleRule extends Rule {
    private String[] multipleSpecialString;

    public MultipleRule(String[] multipleSpecialString) {
        this.multipleSpecialString = multipleSpecialString;
    }

    public String replace(int number, int[] specialNumbers) {
        StringBuilder sequence = new StringBuilder();

        for (int index = 0; index < specialNumbers.length; index++) {
            if (number % specialNumbers[index] == 0) {
                sequence.append(multipleSpecialString[index]);
            }
        }
        return sequence.length() != 0 ? sequence.toString() : doNext(number, specialNumbers);
    }

}
