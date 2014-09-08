package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class ReplaceMultiple implements Replace{
    private enum MultipleTag {
        FIZZ, BUZZ, WHIZZ, MURMUR, BINGO
    }

    public String replace(int number, int[] definedNumbers) {
        StringBuilder sequence = new StringBuilder();

        for (int index=0;index< definedNumbers.length;index++) {
            if (number% definedNumbers[index]==0) { sequence.append(tagMultiple(index)); }
        }
        if (sequence.length()==0) { sequence.append(number); }
        if (definedNumbers.length==4 && sequence.length()==19) { sequence = new StringBuilder().append("Bingo"); }
        return sequence.toString();
    }

    private String tagMultiple(int index) {
        return WordUtils.capitalizeFully(MultipleTag.values()[index].name());
    }
}
