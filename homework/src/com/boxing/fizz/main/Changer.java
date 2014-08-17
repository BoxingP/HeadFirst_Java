package com.boxing.fizz;

public class Changer {
    private final int[] specialNumber;
    private String[] multipleTag = {"Fizz","Buzz","Whizz","Murmur"};

    public Changer(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String change(int testNumber) {
        String sequence = Integer.toString(testNumber);
        String character = Integer.toString(specialNumber[0]);
        return (sequence.contains(character)) ? "Fizz" : changeMultiple(testNumber); 
    }   
    
    private String changeMultiple(int testNumber) {
        StringBuilder result = new StringBuilder();

        for (int i=0;i<specialNumber.length;i++) {
            if (testNumber%specialNumber[i]==0) { result.append(multipleTag[i]); }
        }
        return result.length()==0 ? Integer.toString(testNumber) : result.toString();
    }

}
