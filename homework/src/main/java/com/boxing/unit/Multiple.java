package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class Multiple {
    private enum MultipleTag {
        FIZZ, BUZZ, WHIZZ, MURMUR
    }

    public static String replaceMultiple(int number, int[] definedNumbers) {
        StringBuilder sequence = new StringBuilder();

        for (int index=0;index< definedNumbers.length;index++) {
            if (number% definedNumbers[index]==0) { sequence.append(tagMultiple(index)); }
        }
        if (sequence.length()==0) { sequence.append(number); }
        return sequence.toString();
    }

    private static String tagMultiple(int index) {
        return WordUtils.capitalizeFully(MultipleTag.values()[index].name());
    }
}
