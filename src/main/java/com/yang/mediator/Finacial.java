package com.yang.mediator;

public class Finacial implements Dept {
    private Mediator mediator;

    public Finacial(Mediator mediator) {

        this.mediator = mediator;
        this.mediator.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
        mediator.command("market");
    }
}
