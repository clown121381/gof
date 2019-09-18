package com.yang.strategy;

/**
 *
 *  客户端和具体的策略类分离
 */
public class Context {
    private Stratey stratey;

    public Context(Stratey stratey) {
        this.stratey = stratey;
    }

    public void printPrice(double s){
        System.out.println("打印报价"+stratey.getPrice(s));
    }
}
