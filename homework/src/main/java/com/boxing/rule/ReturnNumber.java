package com.boxing.rule;

public class ReturnNumber extends Replace{

    public String replace(int number, int[] specialNumbers) {
        return Integer.toString(number);
    }
}
