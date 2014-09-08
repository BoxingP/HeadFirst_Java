package com.boxing.fizzBuzzWhizzMurmur;

import com.boxing.unit.*;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizzMurmur {
    public static void main(String[] args) {
        InputAndOutput inputAndOutput = new InputAndOutput();
        
        int[] definedNumbers = new Converter().convert(args);
        if (!new Validator(4).isValid(definedNumbers)) { return; }

        List<Replace> replaceList = Arrays.asList(new ReplaceContain(), new ReplaceMultiple());
        Changer changer = new Changer(definedNumbers, new ReplaceRules(replaceList));
        for (int number=1;number<101;number++) {
            String result = changer.change(number);
            inputAndOutput.printOutput(result);
        }
    }
}
