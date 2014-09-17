package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FizzBuzzWhizz {
    private static ApplicationContext context;

    private static void readConfig() throws Exception{
        context = new ClassPathXmlApplicationContext(System.getProperty("name")+".xml");
    }

    public static void main(String[] args) throws Exception{
        readConfig();

        int amount = (Integer) context.getBean("amountValue");
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] specialNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(specialNumbers)) {
            throw new IllegalArgumentException("Only non repeating digits are allowed!");
        }

        Replace chain = createChain(initReplaceList());
        for (int number=1;number<101;number++) {
            String result = chain.replace(number, specialNumbers);
            inputAndOutput.printOutput(result);
        }
    }

    private static List<Replace> initReplaceList() {

        List<Replace> replaceList = (List<Replace>) context.getBean("replaceRuleList");
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
