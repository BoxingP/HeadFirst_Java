package com.boxing.rule;

public class ReplaceMultiple extends Replace {
    private String[] multipleDefinedString;

    public ReplaceMultiple(String[] multipleDefinedString){
        this.multipleDefinedString = multipleDefinedString;
    }

    public String replace(int number, int[] specialNumbers) {
        StringBuilder sequence = new StringBuilder();

        for (int index=0;index< specialNumbers.length;index++) {
            if (number% specialNumbers[index]==0) { sequence.append(multipleDefinedString[index]); }
        }
        return sequence.length()!=0 ? sequence.toString(): doNext(number, specialNumbers);
    }

}
