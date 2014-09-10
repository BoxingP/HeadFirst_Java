package com.boxing.unit;

import java.util.List;

public class ReplaceRules {
    private List<Replace> replaceList;

    public ReplaceRules(List<Replace> replaceList) {
        this.replaceList = replaceList;
    }

    public String rule(int number, int[] definedNumbers) {
        String result = String.valueOf(number);
        for (Replace replace : replaceList) {
            result = replace.replace(number, definedNumbers);
            if (isHandled(result)) { return result; }
        }
        return result;
    }

    private boolean isHandled(String result) {
        return !result.matches(".*\\d.*");
    }
}
