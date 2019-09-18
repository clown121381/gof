package com.yang.mediator;

/**
 * 中介模式
 *
 * 网状结构解耦变成单纯的一对多
 *
 * mvc m和v通过c作为中介
 */
public class Main {
    public static void main(String[] args) {
        Mediator m = new President();
        Market market = new Market(m);
        Development development = new Development(m);
        Finacial finacial = new Finacial(m);

        market.selfAction();
        market.outAction();

        finacial.outAction();
    }
}
