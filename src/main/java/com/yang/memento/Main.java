package com.yang.memento;

/**
 * 备忘录模式
 * 保存对象内部状态的功能的一个拷贝
 *  源发器类
 *  备忘录类
 *  负责人类
 *
 *  事物的回滚
 */
public class Main {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp("A",18,900);
        //备忘一次
        careTaker.setMemento(emp.memeto());

        emp.setAge(10);

        emp.recovery(careTaker.getMemento());

        System.out.println(emp);
    }
}
