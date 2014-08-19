package com.boxing.unit;

public class Checker {
    private int[] specialNumber;
    private int amount;

    public Checker(int[] specialNumber, int amount) {
        this.specialNumber = specialNumber;
        this.amount = amount;
    }
    
    public boolean check() {
        return (isLimited() && isDigits() && isDifferent());
    }
    
    private boolean isLimited() {
        return (specialNumber.length==amount);
    }

    private boolean isDigits() {
        for (int i=0;i<specialNumber.length;i++) { 
            if (!isDigit(specialNumber[i])) {return false;}
        }
        return true;
    }
    
    private boolean isDigit(int number) {
        return ((number>0) && (number<10));
    }

    private boolean isDifferent() {
        for (int i=0;i<specialNumber.length;i++) {
            for (int j=i+1;j<specialNumber.length;j++) {
                if (specialNumber[i]==specialNumber[j]) { return false; }
            }
        }
        return true;
    }

}

