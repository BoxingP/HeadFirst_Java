package com.boxing.rule;

public abstract class Replace {
    private Replace next=null;

    protected String doNext(int number, int[] definedNumbers) {
        return next.replace(number, definedNumbers);
    }

    public void setNext(Replace replace) {
        next = replace;
    }
    public abstract String replace(int number, int[] definedNumbers);
}
