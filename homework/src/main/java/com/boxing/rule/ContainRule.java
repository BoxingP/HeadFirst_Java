package com.boxing.rule;

public class ContainRule extends Rule {
    private String containSpecialString;
    private int index;

    public ContainRule(String containSpecialString, int index) {
        this.containSpecialString = containSpecialString;
        this.index = index;
    }

    public String replace(int number, int[] specialNumbers) {
        int specialNumber = specialNumbers[index];
        if (containSpecialNumber(number, specialNumber)) {
            return containSpecialString;
        }
        return doNext(number, specialNumbers);
    }

    private static boolean containSpecialNumber(int number, int specialNumber) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(specialNumber);
        return sequence.contains(character);
    }
}