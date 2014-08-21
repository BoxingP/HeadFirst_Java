package com.boxing.unit;

import org.apache.commons.lang3.text.WordUtils;

public class Changer {
    private final int[] specialNumber;
    public enum MultipleTag {
        FIZZ, BUZZ, WHIZZ, MURMUR
    }

    public Changer(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String change(int testNumber) {
        return containTheFirstNumber(testNumber) ? WordUtils.capitalizeFully(MultipleTag.values()[0].name()) : replaceMultiple(testNumber); 
    }   

    private boolean containTheFirstNumber(int testNumber) {
        String sequence = Integer.toString(testNumber);
        String character = Integer.toString(specialNumber[0]);
        return sequence.contains(character);
    }

    private String replaceMultiple(int testNumber) {
        StringBuilder sequence = new StringBuilder();

        for (int i=0;i<specialNumber.length;i++) {
            if (testNumber%specialNumber[i]==0) { sequence.append(WordUtils.capitalizeFully(MultipleTag.values()[i].name())); }
        }
        if (sequence.length()==0) { sequence.append(testNumber); }
        return sequence.toString();
    }

}