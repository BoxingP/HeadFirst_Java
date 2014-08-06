public class NumberChecker {
    private String[] elements;
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public NumberChecker(String[] elements) {
        this.elements = elements;
    }
    
    public boolean check() {
        if (isThree()) {
            firstNumber = Integer.valueOf(elements[0]);
            secondNumber = Integer.valueOf(elements[1]);
            thirdNumber = Integer.valueOf(elements[2]);  
            return (isDigit() && isDifferent());
        } else {
            return false;
        }
    }
    
    private boolean isThree() {
        return (elements.length==3);
    }

    private boolean isDigit() {
        return ((firstNumber>0 && firstNumber<10) && (secondNumber>0 && secondNumber<10) && (thirdNumber>0 && thirdNumber<10));
    }
    
    private boolean isDifferent() {
        return (firstNumber!=secondNumber && firstNumber!=thirdNumber && secondNumber!=thirdNumber);
    }
}

