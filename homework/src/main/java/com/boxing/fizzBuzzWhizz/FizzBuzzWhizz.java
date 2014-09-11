package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class FizzBuzzWhizz {
    public static void main(String[] args) throws Exception{
        Properties config = new Properties();
        InputStream in = FizzBuzzWhizz.class.getResourceAsStream("/fizz.properties");
        config.load(in);
        in.close();
        int amount = Integer.parseInt(config.getProperty("amount.definedNumbers"));
        String[] containDefinedString = config.getProperty("value.contain.definedString").split(",");
        String[] multipleDefinedString = config.getProperty("value.multiple.definedString").split(",");
        args = System.getProperty("args")!=null ? System.getProperty("args").split("\\D"):config.getProperty("value.args").split("\\D");
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] definedNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(definedNumbers)) { return; }

        List<Replace> replaceList = Arrays.asList(new ReplaceContain(containDefinedString), new ReplaceFourMultiple(), new ReplaceMultiple(multipleDefinedString));
        ReplaceRules replaceRuler = new ReplaceRules(replaceList);
        for (int number=1;number<101;number++) {
            String result = replaceRuler.rule(number,definedNumbers);
            inputAndOutput.printOutput(result);
        }
    }
}
