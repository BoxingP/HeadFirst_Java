package com.boxing.fizz;

public class Changer {
    private final int[] specialNumber;
    private String[] multipleTag = {"Fizz","Buzz","Whizz","Murmur"};//"Babble","Purl"

    public Changer(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String change(int testNumber) {
        String sequence = Integer.toString(testNumber);
        String character = Integer.toString(specialNumber[0]);
        return (sequence.contains(character)) ? "Fizz" : changeMultiple(testNumber); 
    }   
    
    private String changeMultiple(int testNumber) {
        String result = "";

        for (int i=0;i<specialNumber.length;i++) {
            if (testNumber%specialNumber[i]==0) { result += multipleTag[i]; }
        }
        return result.equals("") ? Integer.toString(testNumber) : result;
    }

}
