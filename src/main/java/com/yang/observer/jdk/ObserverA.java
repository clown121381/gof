package com.yang.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public void update(Observable o, Object arg) {
        state = ((Subject)o).get();
    }
}
