package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class Contain {
    private enum ContainTag {
        FIZZ, WHIZZ, BUZZ
    }

    public static String replaceContain(int number, int[] definedNumbers) {
        for (int index=0;index<3;index++) {
            if (containDefinedNumber(number, definedNumbers, index)) {return tagContain(index);}
        }
        return Integer.toString(number);
    }

    private static boolean containDefinedNumber(int number, int[] definedNumbers, int index) {
        String sequence = Integer.toString(number);
        String character = Integer.toString(definedNumbers[index]);
        return sequence.contains(character);
    }

    private static String tagContain(int index) {
        return WordUtils.capitalizeFully(ContainTag.values()[index].name());
    }
}
