package com.boxing.rule;

public abstract class Rule {
    private Rule next=null;

    protected String doNext(int number, int[] specialNumbers) {
        return next.rule(number, specialNumbers);
    }

    public void setNext(Rule rule) {
        next = rule;
    }
    public abstract String rule(int number, int[] specialNumbers);
}
