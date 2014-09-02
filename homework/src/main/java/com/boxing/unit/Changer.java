package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class Changer {
    private final int[] definedNumbers;
    private enum ContainTag {
        FIZZ, WHIZZ, BUZZ
    }
    private enum MultipleTag {
        FIZZ, BUZZ, WHIZZ, MURMUR
    }

    public Changer(int[] definedNumbers) {
        this.definedNumbers = definedNumbers;
    }

    public String change(int number) {
        return !replaceContain(number).matches(".*\\d.*") ? replaceContain(number) : replaceMultiple(number);
    }

    private String replaceContain(int number) {
        for (int index=0;index<3;index++) {
            if (containDefinedNumber(number, index)) {return tagContain(index);}
        }
        return Integer.toString(number);
    }

    private boolean containDefinedNumber(int number, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(definedNumbers[index]);
        return sequence.contains(character);
    }

    private String replaceMultiple(int number) {
        StringBuilder sequence = new StringBuilder();

        for (int i=0;i< definedNumbers.length;i++) {
            if (number% definedNumbers[i]==0) { sequence.append(tagMultiple(i)); }
        }
        if (sequence.length()==0) { sequence.append(number); }
        return sequence.toString();
    }

    private String tagContain(int index) {
        return WordUtils.capitalizeFully(ContainTag.values()[index].name());
    }

    private String tagMultiple(int index) {
        return WordUtils.capitalizeFully(MultipleTag.values()[index].name());
    }
}

