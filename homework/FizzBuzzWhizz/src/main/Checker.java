public class Checker {
    private int[] specialNumber;

    public Checker(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }
    
    public boolean check() {
        return (isThree() && isDigits() && isDifferent());
    }
    
    private boolean isThree() {
        return (specialNumber.length==3);
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
        return (specialNumber[0]!=specialNumber[1] && specialNumber[0]!=specialNumber[2] && specialNumber[1]!=specialNumber[2]);
    }

}

