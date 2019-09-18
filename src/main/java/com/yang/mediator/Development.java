package com.yang.mediator;

public class Development implements Dept {

    private Mediator mediator;

    public Development(Mediator mediator) {

        this.mediator = mediator;
        this.mediator.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专业科研");
    }

    @Override
    public void outAction() {
        System.out.println("要钱");
    }
}
