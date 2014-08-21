package com.boxing.unit;

public class Converter {
    private String[] stringElements;

    public Converter(String[] stringElements) {
        this.stringElements = stringElements;
    }

    public int[] convert() throws IllegalArgumentException {
        int[] intElements = new int[stringElements.length];
        for (int i=0;i<intElements.length;i++) {
            try {
                intElements[i] = Integer.parseInt(stringElements[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Only number is allowed!");
            }
        }
        return intElements;
    }
}


