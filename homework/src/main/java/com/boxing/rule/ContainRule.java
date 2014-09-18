package com.boxing.rule;

public class ContainRule extends Rule {
    private String[] containSpecialString;
    private int index;

    public ContainRule(String[] containSpecialString, int index) {
        this.containSpecialString = containSpecialString;
        this.index = index;
    }

    public String replace(int number, int[] specialNumbers) {
        if (containSpecialNumber(number, specialNumbers, index)) {
            return containSpecialString[index];
        }
        return doNext(number, specialNumbers);
    }

    private static boolean containSpecialNumber(int number, int[] specialNumbers, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(specialNumbers[index]);
        return sequence.contains(character);
    }
}