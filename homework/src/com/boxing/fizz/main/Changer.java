package com.boxing.fizz;

public class Changer {
    private final int[] specialNumber;
    private String[] multipleTag = {"Fizz","Buzz","Whizz","Murmur"};

    public Changer(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String change(int testNumber) {
        return isContain(testNumber) ? multipleTag[0] : isMultiple(testNumber); 
    }   

    private boolean isContain(int testNumber) {
        String sequence = Integer.toString(testNumber);
        String character = Integer.toString(specialNumber[0]);
        return sequence.contains(character);
    }

    private String isMultiple(int testNumber) {
        StringBuilder sequence = new StringBuilder();

        for (int i=0;i<specialNumber.length;i++) {
            if (testNumber%specialNumber[i]==0) { sequence.append(multipleTag[i]); }
        }
        if (sequence.length()==0) { sequence.append(testNumber); }
        return sequence.toString();
    }

}
