package com.boxing.fizzBuzzWhizz;

import com.boxing.rule.*;
import com.boxing.unit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FizzBuzzWhizz {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(System.getProperty("name") + ".xml");

        Converter converter = (Converter) context.getBean("converter");
        int[] specialNumbers = converter.convert(args);

        Validator validator = (Validator) context.getBean("validator");
        if (!validator.isValid(specialNumbers)) {
            throw new IllegalArgumentException("Only non repeating digits are allowed!");
        }

        List<Rule> chain = (List<Rule>) context.getBean("chain");
        Rule chainEntrance = chain.get(0);

        countOff(chainEntrance, specialNumbers, context);
    }

    private static void countOff(Rule rule, int[] specialNumbers, ApplicationContext context) {
        InputAndOutput inputAndOutput = (InputAndOutput) context.getBean("inputAndOutput");
        for (int number = 1; number < 101; number++) {
            String result = rule.replace(number, specialNumbers);
            inputAndOutput.printOutput(result);
        }
    }
}
