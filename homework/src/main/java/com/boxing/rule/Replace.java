package com.boxing.rule;

public abstract class Replace {
    protected Replace next=null;

    public void setNext(Replace replace) {
        next = replace;
    }
    public abstract String replace(int number, int[] definedNumbers);
}
