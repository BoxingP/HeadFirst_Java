package com.boxing.rule;

public class ReplaceMultiple extends Replace {
    private String[] multipleDefinedString;

    public ReplaceMultiple(String[] multipleDefinedString){
        this.multipleDefinedString = multipleDefinedString;
    }

    public String replace(int number, int[] definedNumbers) {
        StringBuilder sequence = new StringBuilder();

        for (int index=0;index< definedNumbers.length;index++) {
            if (number% definedNumbers[index]==0) { sequence.append(multipleDefinedString[index]); }
        }
        return sequence.length()!=0 ? sequence.toString(): doNext(number, definedNumbers);
    }

}
