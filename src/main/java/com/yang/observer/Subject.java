package com.yang.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> list = new ArrayList<>();

    void register(Observer observer){
        list.add(observer);
    }

    void remove(Observer observer){
        list.remove(observer);
    }

    //通知
    public void notifyAllObserver(){
        for (Observer observer : list) {
            observer.upddate(this);
        }
    }
}
class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    //目标对象值发生变化会通知所有的观察者
    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }
}
