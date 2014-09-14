package com.boxing.unit;

import com.boxing.rule.Replace;

import java.util.List;

public class ReplaceRules {
    private List<Replace> replaceList;

    public ReplaceRules(List<Replace> replaceList) {
        this.replaceList = replaceList;
    }

    public String rule(int number, int[] definedNumbers) {
        Replace chain = createChain();
        return chain.replace(number, definedNumbers);
    }

    private Replace createChain() {
        replaceList.size();
        for (int index=0;index<replaceList.size()-1;index++) {
            replaceList.get(index).setNext(replaceList.get(index+1));
        }
        return replaceList.get(0);
    }
}
