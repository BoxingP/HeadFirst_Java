package com.boxing.rule;

public class ReturnNumber extends Replace{

    public String replace(int number, int[] definedNumbers) {
        return Integer.toString(number);
    }
}
