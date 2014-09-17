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

        int amount = (Integer) context.getBean("amountValue");
        InputAndOutput inputAndOutput = new InputAndOutput();

        int[] specialNumbers = new Converter().convert(args);
        if (!new Validator(amount).isValid(specialNumbers)) {
            throw new IllegalArgumentException("Only non repeating digits are allowed!");
        }

        Rule chain = createChain(initRuleList());
        for (int number = 1; number < 101; number++) {
            String result = chain.rule(number, specialNumbers);
            inputAndOutput.printOutput(result);
        }
    }

    private static List<Rule> initRuleList() {

        List<Rule> ruleList = (List<Rule>) context.getBean("ruleList");
        return ruleList;
    }

    private static Rule createChain(List<Rule> ruleList) {
        ruleList.size();
        for (int index = 0; index < ruleList.size() - 1; index++) {
            ruleList.get(index).setNext(ruleList.get(index + 1));
        }
        return ruleList.get(0);
    }
}
