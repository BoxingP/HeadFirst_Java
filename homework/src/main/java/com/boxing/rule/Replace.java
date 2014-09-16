package com.boxing.rule;

public abstract class Replace {
    private Replace next=null;

    protected String doNext(int number, int[] specialNumbers) {
        return next.replace(number, specialNumbers);
    }

    public void setNext(Replace replace) {
        next = replace;
    }
    public abstract String replace(int number, int[] specialNumbers);
}
