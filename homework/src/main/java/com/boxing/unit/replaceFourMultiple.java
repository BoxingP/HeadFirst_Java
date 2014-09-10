package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class ReplaceFourMultiple{
    private enum DefinedTag {
        FIZZ, BUZZ, WHIZZ, MURMUR, BINGO
    }
    public String replace(String sequence, int[] definedNumbers) {
        if (definedNumbers.length!=4) return sequence;
        for (int i=0;i<definedNumbers.length;i++) {
            if (!sequence.contains(getDefinedTag(i))) return sequence;
        }
        return getDefinedTag(4);
    }

    private String getDefinedTag(int index) {
        return WordUtils.capitalizeFully(DefinedTag.values()[index].name());
    }
}
