package com.yang.observer;

public interface Observer {
    void upddate(Subject subject);
}
class ObserverA implements Observer{

    private int myState;//myState 需要自动于目标对象保持一致

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void upddate(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}
