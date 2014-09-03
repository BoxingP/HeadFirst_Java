package com.boxing.unit;

public class Changer {
    private final int[] definedNumbers;

    public Changer(int[] definedNumbers) {
        this.definedNumbers = definedNumbers;
    }

    public String change(int number) {
        String result =  Contain.replaceContain(number, definedNumbers);
        return isHandled(result) ? result : Multiple.replaceMultiple(number, definedNumbers);
    }

    private boolean isHandled(String result) {
        return !result.matches(".*\\d.*");
    }

}

