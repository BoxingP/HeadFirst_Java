package com.boxing.unit;

public class Converter {

    public int[] convert(String[] inputElements) {
        int[] outputElements = new int[inputElements.length];
        for (int i = 0; i < outputElements.length; i++) {
            try {
                outputElements[i] = Integer.parseInt(inputElements[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Only number is allowed!");
            }
        }
        return outputElements;
    }
}


