package com.boxing.unit;

public class Converter {

    public int[] convert(String[] inputElements) {
        int[] outputElements = new int[inputElements.length];
        for (int i = 0; i < outputElements.length; i++) {
            outputElements[i]=convertStringToInteger(inputElements[i]);
        }
        return outputElements;
    }

    private int convertStringToInteger (String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only number is allowed!");
        }
    }
}


