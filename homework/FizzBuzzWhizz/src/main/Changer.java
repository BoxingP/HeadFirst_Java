public class Changer {
    private final int[] convertedElements;

    public Changer(int[] convertedElements) {
        this.convertedElements = convertedElements;
    }

    public String change(int testNumber) {
        return (Integer.toString(testNumber).contains(Integer.toString(convertedElements[0]))) ? "Fizz" : changeMultiple(testNumber); 
    }
    
    private String changeMultiple(int testNumber) {
        String result = "";
        String[] multipleTag = {"Fizz","Buzz","Whizz"};
        
        for (int i=0;i<convertedElements.length;i++) {
            if (testNumber%convertedElements[i]==0) { result += multipleTag[i]; }
        }
        return result.equals("") ? Integer.toString(testNumber) : result;
    }

}
