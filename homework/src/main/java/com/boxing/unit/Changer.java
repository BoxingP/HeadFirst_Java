package com.boxing.unit;

public class Changer {
    private final int[] definedNumbers;

    public Changer(int[] definedNumbers) {
        this.definedNumbers = definedNumbers;
    }

    public String change(int number) {
        ChangeRule changeRule;

        changeRule = new ChangeRule(new ReplaceContain());
        String result = changeRule.replace(number, definedNumbers);
        if (isNotHandled(result)) {
            changeRule = new ChangeRule(new ReplaceMultiple());
            result = changeRule.replace(number, definedNumbers);
        }
        return result;
    }

    private boolean isNotHandled(String result) {
        return result.matches(".*\\d.*");
    }

}

