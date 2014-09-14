package com.boxing.rule;

public interface Replace {
    public void setNext(Replace replace);
    public String replace(int number, int[] definedNumbers);
}
