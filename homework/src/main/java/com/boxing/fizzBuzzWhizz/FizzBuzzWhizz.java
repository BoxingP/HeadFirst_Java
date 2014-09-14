package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FizzBuzzWhizz {
    public static void main(String[] args) throws Exception{
        Properties config = new Properties();
        InputStream in = FizzBuzzWhizz.class.getResourceAsStream("/"+System.getProperty("name")+".properties");
        config.load(in);
        in.close();

        int amount = Integer.parseInt(config.getProperty("amount.definedNumbers"));
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] definedNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(definedNumbers)) {
            throw new NumberFormatException("Only non repeating digits are allowed!");
        }

        String[] definedStringList = config.getProperty("definedString.list").split(",");
        String[] replaceRuleList = config.getProperty("replace.rule.list").split(",");
        List<Replace> replaceList = new ArrayList<Replace>();
        for (int index=0;index<replaceRuleList.length;index++) {
            Constructor constructor = Class.forName(replaceRuleList[index]).getConstructor(new Class[]{String[].class});
            String[] definedString = config.getProperty(definedStringList[index]).split(",");
            Replace replace = (Replace) constructor.newInstance(new Object[]{definedString});
            replaceList.add(replace);
        }

        ReplaceRules replaceRuler = new ReplaceRules(replaceList);
        for (int number=1;number<101;number++) {
            String result = replaceRuler.rule(number,definedNumbers);
            inputAndOutput.printOutput(result);
        }
    }
}
