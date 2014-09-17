package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FizzBuzzWhizz {
    private static ApplicationContext context;

    private static void readConfig() throws Exception {
        context = new ClassPathXmlApplicationContext(System.getProperty("name") + ".xml");
    }

    public static void main(String[] args) throws Exception {
        readConfig();

        int amount = (Integer) context.getBean("amountValue");
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] specialNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(specialNumbers)) {
            throw new IllegalArgumentException("Only non repeating digits are allowed!");
        }

        Rule chainEntrance = (Rule) context.getBean("containRule");
        for (int number = 1; number < 101; number++) {
            String result = chainEntrance.replace(number, specialNumbers);
            inputAndOutput.printOutput(result);
        }
    }
}
