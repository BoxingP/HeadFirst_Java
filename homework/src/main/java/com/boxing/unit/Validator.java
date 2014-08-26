package com.boxing.unit;

public class Validator {
    private int amount;

    public Validator(int amount) {
        this.amount = amount;
    }

    public boolean isValid(int[] checkedNumber) {
        return (isLimited(checkedNumber) && isDigits(checkedNumber) && isDifferent(checkedNumber));
    }
    
    private boolean isLimited(int[] checkedNumber) {
        return (checkedNumber.length==amount);
    }

    private boolean isDigits(int[] checkedNumber) {
        for (int aCheckedNumber : checkedNumber) {
            if (!isDigit(aCheckedNumber)) return false;
        }
        return true;
    }
    
    private boolean isDigit(int number) {
        return ((number>0) && (number<10));
    }

    private boolean isDifferent(int[] checkedNumber) {
        for (int i=0;i<checkedNumber.length;i++) {
            for (int j=i+1;j<checkedNumber.length;j++) {
                if (checkedNumber[i]==checkedNumber[j]) return false;
            }
        }
        return true;
    }

}

