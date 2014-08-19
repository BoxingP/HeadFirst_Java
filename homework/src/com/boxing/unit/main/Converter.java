package com.boxing.unit;

public class Converter {
    private String[] inputElements;

    public Converter(String[] inputElements) {
        this.inputElements = inputElements;
    }

    public int[] convert() throws IllegalArgumentException {
        int[] convertedElements = new int[inputElements.length];
        for (int i=0;i<convertedElements.length;i++) {
            try {
                convertedElements[i] = Integer.parseInt(inputElements[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Only number is allowed!");
            }
        }
        return convertedElements;
    }
}


