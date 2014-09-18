package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FizzBuzzWhizz {
    private static ApplicationContext context;

    private static void readConfig() throws Exception {
        context = new ClassPathXmlApplicationContext(System.getProperty("name") + ".xml");
    }

    public static void main(String[] args) throws Exception {
        readConfig();

        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] specialNumbers = new Converter().convert(args);

        Validator validator = (Validator) context.getBean("validator");
        if (!validator.isValid(specialNumbers)) {
            throw new IllegalArgumentException("Only non repeating digits are allowed!");
        }

        List<Rule> chain = (List<Rule>) context.getBean("chain");
        Rule chainEntrance = chain.get(0);

        for (int number = 1; number < 101; number++) {
            String result = chainEntrance.replace(number, specialNumbers);
            inputAndOutput.printOutput(result);
        }
    }
}
