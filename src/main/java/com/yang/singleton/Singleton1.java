package com.yang.singleton;

/**
 * 饿汉式创建的的单例模式
 * 1、线程安全
 * 2、不能延迟加载
 */
public class Singleton1 {

    //创建静态实例
    private static Singleton1 instance = new Singleton1();
    //私有化构造方法
    private Singleton1(){}
    //提供访问类的实例对象的方法
    public static Singleton1 getInstance(){
        return instance;
    }
}
