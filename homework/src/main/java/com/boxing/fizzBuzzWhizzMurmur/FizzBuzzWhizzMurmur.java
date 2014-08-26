package com.boxing.fizzBuzzWhizzMurmur;

import com.boxing.unit.*;

public class FizzBuzzWhizzMurmur {
    public static void main(String[] args) {
        InputAndOutput inputAndOutput = new InputAndOutput();
        
        if (args.length==0) {
            System.out.println("Please input four different digits:");
            String keyboardInput = inputAndOutput.getInput();
            args = keyboardInput.split("\\D");
        }

        int[] definedNumbers = new Converter(args).convert();
        if (!new Validator(4).isValid(definedNumbers)) { return; }
       
        Changer changer = new Changer(definedNumbers);
        for (int number=1;number<101;number++) {
            String result = changer.change(number);
            inputAndOutput.printOutput(result);
        }
    }
}
