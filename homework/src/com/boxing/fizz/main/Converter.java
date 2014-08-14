package com.boxing.fizz;

public class Converter {
    private String[] inputElements;

    public Converter(String[] inputElements) {
        this.inputElements = inputElements;//String.split("\\D");
    }

    public int[] convert() {
        int[] convertedElements = new int[inputElements.length];
        for (int i=0;i<convertedElements.length;i++) {
            if (!inputElements[i].matches(".*\\d+.*")) { break; }
            convertedElements[i] = Integer.parseInt(inputElements[i]);
        }
        return convertedElements;
    }
}


