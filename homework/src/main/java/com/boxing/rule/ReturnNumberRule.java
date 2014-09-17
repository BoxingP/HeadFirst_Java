package com.boxing.rule;

public class ReturnNumberRule extends Rule {

    public String replace(int number, int[] specialNumbers) {
        return Integer.toString(number);
    }
}
