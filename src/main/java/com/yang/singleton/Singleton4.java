package com.yang.singleton;

/**
 * 静态内部类的方式实现单例模式
 * 1、线程安全
 * 2、延迟加载
 *
 */
public class Singleton4 {
    //利用虚拟机类加载的特性，实现线程的安全
    private static class SingletonInner{
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4(){}

    public static Singleton4 getInstance(){
        return SingletonInner.instance;
    }
}
