package com.boxing.rule;

public class ReplaceContain implements Replace {
    private String[] containDefinedString;
    private Replace next=null;

    public ReplaceContain(String[] containDefinedString) {
        this.containDefinedString = containDefinedString;
    }

    public void setNext(Replace replace) { next = replace; }

    public String replace(int number, int[] definedNumbers) {
        for (int index = 0; index < Math.min(definedNumbers.length,containDefinedString.length); index++) {
            if (containDefinedNumber(number, definedNumbers, index)) {
                return containDefinedString[index];
            }
        }
        return next!=null ? next.replace(number, definedNumbers):String.valueOf(number);
    }

    private static boolean containDefinedNumber(int number, int[] definedNumbers, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(definedNumbers[index]);
        return sequence.contains(character);
    }
}