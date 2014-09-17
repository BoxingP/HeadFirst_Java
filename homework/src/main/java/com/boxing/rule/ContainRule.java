package com.boxing.rule;

public class ContainRule extends Rule {
    private String[] containDefinedString;

    public ContainRule(String[] containDefinedString) {
        this.containDefinedString = containDefinedString;
    }

    public String rule(int number, int[] specialNumbers) {
        for (int index = 0; index < Math.min(specialNumbers.length, containDefinedString.length); index++) {
            if (containDefinedNumber(number, specialNumbers, index)) {
                return containDefinedString[index];
            }
        }
        return doNext(number, specialNumbers);
    }

    private static boolean containDefinedNumber(int number, int[] definedNumbers, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(definedNumbers[index]);
        return sequence.contains(character);
    }
}