package com.boxing.fizzBuzzWhizz;

import com.boxing.unit.*;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizz {
    public static void main(String[] args) {
        InputAndOutput inputAndOutput = new InputAndOutput();
        
        int[] definedNumbers = new Converter(args).convert();
        if (!new Validator(3).isValid(definedNumbers)) { return; }

        List<Replace> replaceList = Arrays.asList(new ReplaceContain(), new ReplaceMultiple());
        Changer changer = new Changer(definedNumbers, replaceList);
        for (int number=1;number<101;number++) {
            String result = changer.change(number);
            inputAndOutput.printOutput(result);
        }
    }
}
