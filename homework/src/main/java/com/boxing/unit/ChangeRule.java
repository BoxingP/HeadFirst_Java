package com.boxing.unit;

public class ChangeRule {
    Replace replace;
    public ChangeRule(Replace replace){
        this.replace = replace;
    }
    public String replace(int number, int[] definedNumbers) {
        return this.replace.replace(number, definedNumbers);
    }
}
