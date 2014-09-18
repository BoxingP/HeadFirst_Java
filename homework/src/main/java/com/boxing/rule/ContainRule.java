package com.boxing.rule;

public class ContainRule extends Rule {
    private String[] containSpecialString;

    public ContainRule(String[] containSpecialString) {
        this.containSpecialString = containSpecialString;
    }

    public String replace(int number, int[] specialNumbers) {
        for (int index = 0; index < Math.min(specialNumbers.length, containSpecialString.length); index++) {
            if (containSpecialNumber(number, specialNumbers, index)) {
                return containSpecialString[index];
            }
        }
        return doNext(number, specialNumbers);
    }

    private static boolean containSpecialNumber(int number, int[] specialNumbers, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(specialNumbers[index]);
        return sequence.contains(character);
    }
}