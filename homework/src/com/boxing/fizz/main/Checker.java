package com.boxing.fizz;

public class Checker {
    private int[] specialNumber;

    public Checker(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }
    
    public boolean check() {
        return (isFour() && isDigits() && isDifferent());
    }
    
    private boolean isFour() {
        return (specialNumber.length==4);
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

