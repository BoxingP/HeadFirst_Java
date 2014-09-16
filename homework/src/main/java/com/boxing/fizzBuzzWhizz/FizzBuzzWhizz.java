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

        int amount = Integer.parseInt(config.getProperty("amount.specialNumbers"));
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] specialNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(specialNumbers)) {
            throw new IllegalArgumentException("Only non repeating digits are allowed!");
        }

        Replace chain = createChain(initReplaceList(config));
        for (int number=1;number<101;number++) {
            String result = chain.replace(number, specialNumbers);
            inputAndOutput.printOutput(result);
        }
    }

    private static List<Replace> initReplaceList(Properties config) throws Exception{
        String[] definedStringList = config.getProperty("specialString.list").split(",");
        String[] replaceRuleList = config.getProperty("replace.rule.list").split(",");
        List<Replace> replaceList = new ArrayList<>();

        for (int index=0;index<definedStringList.length;index++) {
            Constructor constructor = Class.forName(replaceRuleList[index]).getConstructor(new Class[]{String[].class});
            String[] definedString = config.getProperty(definedStringList[index]).split(",");
            Replace replace = (Replace) constructor.newInstance(new Object[]{definedString});
            replaceList.add(replace);
        }
        replaceList.add(new ReturnNumber());
        return replaceList;
    }

    private static Replace createChain(List<Replace> replaceList) {
        replaceList.size();
        for (int index=0;index<replaceList.size()-1;index++) {
            replaceList.get(index).setNext(replaceList.get(index+1));
        }
        return replaceList.get(0);
    }
}
