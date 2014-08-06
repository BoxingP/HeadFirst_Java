public class Checker {
    private String[] inputElements;
    public static int[] convertedElements;

    public Checker(String inputString) {
        inputElements = inputString.split("\\D");
    }
    
    public boolean check() {
        return (isThree() && isDigits() && isDifferent());
    }
    
    private boolean isThree() {
        return (inputElements.length==3);
    }

    private boolean isDigits() {
        convert();
        for (int i=0;i<convertedElements.length;i++) { 
            if (!isDigit(convertedElements[i])) {return false;}
        }
        return true;
    }
    
    private int[] convert() {
        convertedElements = new int[inputElements.length];
        for (int i=0;i<convertedElements.length;i++) {
            convertedElements[i] = Integer.parseInt(inputElements[i]);
        }
        return convertedElements;
    }
    
    private boolean isDigit(int number) {
        return ((number>0) && (number<10));
    }

    private boolean isDifferent() {
        return (convertedElements[0]!=convertedElements[1] && convertedElements[0]!=convertedElements[2] && convertedElements[1]!=convertedElements[2]);
    }

}

