package com.boxing.unit;

public class Changer {
    private int[] definedNumbers;
    private ReplaceRules replaceRules;

    public Changer(int[] definedNumbers, ReplaceRules replaceRules) {
        this.definedNumbers = definedNumbers;
        this.replaceRules = replaceRules;
    }

    public String change(int number) {
        return replaceRules.rule(number, definedNumbers);
    }


}

