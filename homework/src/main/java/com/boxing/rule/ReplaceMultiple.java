package com.boxing.rule;

public class ReplaceMultiple implements Replace {
    private String[] multipleDefinedString;

    public ReplaceMultiple(String[] multipleDefinedString){
        this.multipleDefinedString = multipleDefinedString;
    }

    public String replace(int number, int[] definedNumbers) {
        StringBuilder sequence = new StringBuilder();

        for (int index=0;index< Math.min(definedNumbers.length,multipleDefinedString.length);index++) {
            if (number% definedNumbers[index]==0) { sequence.append(multipleDefinedString[index]); }
        }
        if (sequence.length()==0) { sequence.append(number); }
        return sequence.toString();
    }
}
