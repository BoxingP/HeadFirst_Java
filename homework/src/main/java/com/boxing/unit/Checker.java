package com.boxing.unit;

public class Checker {
    private int[] checkedNumber;
    private int amount;

    public Checker(int amount) {
        this.amount = amount;
    }

    public boolean check(int[] checkedNumber) {
        this.checkedNumber = checkedNumber;
        return (isLimited() && isDigits() && isDifferent());
    }
    
    private boolean isLimited() {
        return (checkedNumber.length==amount);
    }

    private boolean isDigits() {
        for (int i=0;i<checkedNumber.length;i++) { 
            if (!isDigit(checkedNumber[i])) {return false;}
        }
        return true;
    }
    
    private boolean isDigit(int number) {
        return ((number>0) && (number<10));
    }

    private boolean isDifferent() {
        for (int i=0;i<checkedNumber.length;i++) {
            for (int j=i+1;j<checkedNumber.length;j++) {
                if (checkedNumber[i]==checkedNumber[j]) { return false; }
            }
        }
        return true;
    }

}

