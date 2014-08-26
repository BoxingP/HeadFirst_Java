package com.boxing.unit;

public class Validator {
    private int amount;

    public Validator(int amount) {
        this.amount = amount;
    }

    public boolean isValid(int[] numbers) {
        return (isLimited(numbers) && isDigits(numbers) && isDifferent(numbers));
    }
    
    private boolean isLimited(int[] numbers) {
        return (numbers.length==amount);
    }

    private boolean isDigits(int[] numbers) {
        for (int number : numbers) {
            if (!isDigit(number)) return false;
        }
        return true;
    }
    
    private boolean isDigit(int number) {
        return ((number>0) && (number<10));
    }

    private boolean isDifferent(int[] numbers) {
        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                if (numbers[i]==numbers[j]) return false;
            }
        }
        return true;
    }

}

