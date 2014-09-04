package com.boxing.unit;

import java.util.Arrays;
import java.util.List;

public class Changer {
    private int[] definedNumbers;
    List<Replace> replaceList;

    public Changer(int[] definedNumbers, List<Replace> replaceList) {
        this.definedNumbers = definedNumbers;
        this.replaceList = replaceList;
    }

    public String change(int number) {
        for (Replace replace : replaceList) {
            String result = replace.replace(number, definedNumbers);
            if (isHandled(result)) { return result; }
        }
        return String.valueOf(number);
    }

    private boolean isHandled(String result) {
        return !result.matches(".*\\d.*");
    }

}

