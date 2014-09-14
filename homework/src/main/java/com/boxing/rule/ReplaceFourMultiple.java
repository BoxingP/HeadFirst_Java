package com.boxing.rule;

public class ReplaceFourMultiple implements Replace{
    private String multipleFourDefinedString;
    private Replace next=null;

    public ReplaceFourMultiple(String[] multipleFourDefinedString){
        this.multipleFourDefinedString = multipleFourDefinedString[0];
    }

    public void setNext(Replace replace) {
        next = replace;
    }

    public String replace(int number, int[] definedNumbers) {
        if (definedNumbers.length==4) {
            for (int definedNumber : definedNumbers) {
                if (number % definedNumber != 0) break;
                return multipleFourDefinedString;
            }
        }
        return next!=null ? next.replace(number, definedNumbers):String.valueOf(number);
    }

}
