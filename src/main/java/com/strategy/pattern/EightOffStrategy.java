package com.strategy.pattern;

public class EightOffStrategy implements Strategy {
    public boolean support(Integer i) {
        return i == 2 ? true : false;
    }

    public void doStrategy() {
        System.out.println("打8折");
    }
}
