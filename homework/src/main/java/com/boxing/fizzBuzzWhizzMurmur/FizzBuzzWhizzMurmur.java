package com.boxing.fizzBuzzWhizzMurmur;

import com.boxing.unit.*;

public class FizzBuzzWhizzMurmur {
    public static void main(String[] args) {
        InputAndOutput inputAndOutput = new InputAndOutput();
        
        int[] definedNumbers = new Converter(args).convert();
        if (!new Validator(4).isValid(definedNumbers)) { return; }
       
        Changer changer = new Changer(definedNumbers);
        for (int number=1;number<101;number++) {
            String result = changer.change(number);
            inputAndOutput.printOutput(result);
        }
    }
}
