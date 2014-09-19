package com.boxing.rule;

public class MultipleRule extends Rule {
    private String[] multipleSpecialString;

    public MultipleRule(String[] multipleSpecialString) {
        this.multipleSpecialString = multipleSpecialString;
    }

    public String replace(int number, int[] specialNumbers) {
        StringBuilder sequence = new StringBuilder();
        return isMultiple(number, specialNumbers, sequence) ? sequence.toString() : doNext(number, specialNumbers);
    }

    private boolean isMultiple(int number, int[] specialNumbers, StringBuilder sequence) {
        for (int index = 0; index < specialNumbers.length; index++) {
            replaceMultipleToString(number, specialNumbers, sequence, index);
        }
        return sequence.length() != 0;
    }

    private StringBuilder replaceMultipleToString(int number, int[] specialNumbers, StringBuilder sequence, int index) {
        return number % specialNumbers[index] == 0 ? sequence.append(multipleSpecialString[index]) : sequence;
    }
}
