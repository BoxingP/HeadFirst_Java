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
        if (containDefinedNumber(number, 0)) {return tagNumber(0);}
        else if (containDefinedNumber(number, 1)) {return "Whizz";}
        return replaceMultiple(number);
    }

    private boolean containDefinedNumber(int number, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(definedNumbers[index]);
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
