public class Changer {
    private final int[] specialNumber;

    public Changer(int[] specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String change(int testNumber) {
        return (Integer.toString(testNumber).contains(Integer.toString(specialNumber[0]))) ? "Fizz" : changeMultiple(testNumber); 
    }
    
    private String changeMultiple(int testNumber) {
        String result = "";
        String[] multipleTag = {"Fizz","Buzz","Whizz"};
        
        for (int i=0;i<specialNumber.length;i++) {
            if (testNumber%specialNumber[i]==0) { result += multipleTag[i]; }
        }
        return result.equals("") ? Integer.toString(testNumber) : result;
    }

}
