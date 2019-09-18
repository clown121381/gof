package com.yang.tempplateMethod;

public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("排队取号");
    }
    public abstract void transact(); //办理业务

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){ //模板方法
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}

