package com.yang.observer.jdk;

import java.util.Observable;

/**
 * 监控的主题
 */
public class Subject extends Observable {
   private int state;
   public void set(int state){
       this.state = state;
       super.setChanged();
       super.notifyObservers();
   }
   public int get(){
       return state;
   }
}
