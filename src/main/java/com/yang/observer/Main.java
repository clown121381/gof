package com.yang.observer;

/**
 *
 * 多个订阅者，客户机称之为观察者同步的广播
 *
 * 1：N的通知
 */
public class Main {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();
        //多个观察者
        ObserverA a = new ObserverA();
        ObserverA a1 = new ObserverA();
        ObserverA a2 = new ObserverA();

        subject.register(a);
        subject.register(a1);
        subject.register(a2);

        //改变观察者着状态
        subject.setState(300);

        subject.setState(900);

        System.out.println(a.getMyState());
        System.out.println(a1.getMyState());
        System.out.println(a2.getMyState());
    }

}

