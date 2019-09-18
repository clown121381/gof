package com.yang.observer.jdk;

public class Main {
    public static void main(String[] args) {
        Subject sub = new Subject();
        ObserverA a1 = new ObserverA();
        ObserverA a2 = new ObserverA();
        ObserverA a3 = new ObserverA();
        ObserverA a4 = new ObserverA();

        sub.addObserver(a1);
        sub.addObserver(a2);
        sub.addObserver(a3);
        sub.addObserver(a4);

        sub.set(200);

        System.out.println(a1.getState());
        System.out.println(a2.getState());
        System.out.println(a3.getState());
        System.out.println(a4.getState());

    }

}
