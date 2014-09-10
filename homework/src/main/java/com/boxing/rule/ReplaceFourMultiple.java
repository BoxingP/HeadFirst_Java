package com.boxing.rule;

public class ReplaceFourMultiple implements Replace{

    public String replace(int number, int[] definedNumbers) {
        if (definedNumbers.length!=4) return String.valueOf(number);
        for (int index=0;index<definedNumbers.length;index++) {
            if (number%definedNumbers[index]!=0) return String.valueOf(number);
        }
        return "Bingo";
    }

}
