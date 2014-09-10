package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizz {
    public static void main(String[] args) throws Exception{
        PropertiesConfiguration config = new PropertiesConfiguration("config.properties");
        int amount = config.getInt("amount.definedNumbers");
        args = System.getProperty("args")!=null ? System.getProperty("args").split("\\D"):config.getStringArray("value.args");
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] definedNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(definedNumbers)) { return; }

        List<Replace> replaceList = Arrays.asList(new ReplaceContain(), new ReplaceMultiple());
        Changer changer = new Changer(definedNumbers, new ReplaceRules(replaceList));
        for (int number=1;number<101;number++) {
            String result = changer.change(number);
            inputAndOutput.printOutput(result);
        }
    }
}
