package com.yang.mediator;

public class Market implements Dept{

    private Mediator mediator;

    public Market(Mediator mediator) {

        this.mediator = mediator;
        this.mediator.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
    }
}
