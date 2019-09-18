package com.yang.tempplateMethod;

/**
 *
 * 第一算法骨架，将某些步骤延迟到子类中实现
 */
public class Main {
    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod = new BankTemplateMethod() {
            public void transact(){
                System.out.println("我要取款");
            }
        };

        bankTemplateMethod.process();
    }
}
