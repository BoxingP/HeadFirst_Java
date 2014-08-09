public class FizzBuzzWhizz {

    public static void main(String[] args){
        InputAndOutput inputAndOutput = new InputAndOutput();
        System.out.println("Please input special numbers which should be three different digits:");
        String inputString = inputAndOutput.getInput();
        
        int[] specialNumber = new Converter(inputString).convert();
        if (!new Checker(specialNumber).check()) { return; }

        System.out.println("Count off!");
        for (int testNumber=1;testNumber<101;testNumber++) { 
            String result = new Changer(specialNumber).change(testNumber);
            inputAndOutput.printOutput(result);
        }
    }
}
