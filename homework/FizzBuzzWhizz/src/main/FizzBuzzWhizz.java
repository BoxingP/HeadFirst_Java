public class FizzBuzzWhizz {

    public static void main(String[] args){
        int[] specialNumber = new DefineSpecialNumber().defineSpecialNumber();
        
        System.out.println("Count off!");
        for (int testNumber=1;testNumber<101;testNumber++) { 
            String result = new Changer(specialNumber).change(testNumber);
            new InputAndOutput().printOutput(result);
        }
    }
}
