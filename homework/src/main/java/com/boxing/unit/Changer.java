package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class Changer {
    private final int[] definedNumbers;
    private enum Tag {
        FIZZ, BUZZ, WHIZZ, MURMUR
    }

    public Changer(int[] definedNumbers) {
        this.definedNumbers = definedNumbers;
    }

    public String change(int number) {
        return containTheFirstDefinedNumber(number) ? tagNumber(0) : replaceMultiple(number);
    }   

    private boolean containTheFirstDefinedNumber(int number) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(definedNumbers[0]);
        return sequence.contains(character);
    }

    private String replaceMultiple(int number) {
        StringBuilder sequence = new StringBuilder();

        for (int i=0;i< definedNumbers.length;i++) {
            if (number% definedNumbers[i]==0) { sequence.append(tagNumber(i)); }
        }
        if (sequence.length()==0) { sequence.append(number); }
        return sequence.toString();
    }

    private String tagNumber(int index) {
        return WordUtils.capitalizeFully(Tag.values()[index].name());
    }

}
