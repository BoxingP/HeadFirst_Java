package com.boxing.unit;

public class Converter {
    private String[] inputElements;

    public Converter(String[] inputElements) {
        this.inputElements = inputElements;
    }

    public int[] convert() {
        int[] outputElements = new int[inputElements.length];
        for (int i=0;i<outputElements.length;i++) {
            try {
                outputElements[i] = Integer.parseInt(inputElements[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Only number is allowed!");
            }
        }
        return outputElements;
    }
}


