package com.boxing.fizz;

public class FizzBuzzWhizz {
    public static void main(String[] args) {
        InputAndOutput inputAndOutput = new InputAndOutput();
        
        if (args.length==0) {
            System.out.println("Please input three different digits:");
            String keyboardInput = inputAndOutput.getInput();
            args = keyboardInput.split("\\D");
        }

        int[] specialNumber = new Converter(args).convert();
        if (!new Checker(specialNumber, 3).check()) { return; }
       
        Changer changer = new Changer(specialNumber); 
        for (int testNumber=1;testNumber<101;testNumber++) {
            String result = changer.change(testNumber);
            inputAndOutput.printOutput(result);
        }
    }
}
