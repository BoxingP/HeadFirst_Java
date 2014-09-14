package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;

import java.io.InputStream;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Properties;

public class FizzBuzzWhizz {
    public static void main(String[] args) throws Exception{
        Properties config = new Properties();
        InputStream in = FizzBuzzWhizz.class.getResourceAsStream("/"+System.getProperty("name")+".properties");
        config.load(in);
        in.close();

        String[] containDefinedString = config.getProperty("value.contain.definedString").split(",");
        String[] multipleDefinedString = config.getProperty("value.multiple.definedString").split(",");
        String multipleFourDefinedString = config.getProperty("value.multipleFour.definedString");
        int amount = Integer.parseInt(config.getProperty("amount.definedNumbers"));
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] definedNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(definedNumbers)) {
            throw new NumberFormatException("Only non repeating digits are allowed!");
        }

        List<Replace> replaceList = Arrays.asList(new ReplaceContain(containDefinedString), new ReplaceFourMultiple(multipleFourDefinedString), new ReplaceMultiple(multipleDefinedString));
        ReplaceRules replaceRuler = new ReplaceRules(replaceList);
        for (int number=1;number<101;number++) {
            String result = replaceRuler.rule(number,definedNumbers);
            inputAndOutput.printOutput(result);
        }
    }
}
