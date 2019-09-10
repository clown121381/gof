package com.yang.singleton;

/**
 * 双端检索创建单例模式（DCL）
 * 1、线程安全
 * 2、延迟加载
 *
 * 实际上是对线程安全的懒汉模式进行的一种改进，只有在创建对象的时候会进行同步
 */
public class Singleton3 {
    /*
     * 这里和懒汉模式一样不在类的初始化的时候创建对象，
     * volatile 关键字的作用是禁止指令的重排序，避免双端检索被破坏
     */
    private static volatile Singleton3 instance;

    //私有化的构造方法
    private Singleton3(){}

    public static Singleton3 getInstance(){
        //第一层判断的目的是避免每次调用方法的时候都会被加锁
        if(instance == null){
            //同步确保相乘的安全
            synchronized (Singleton3.class){
                //第二层判断决定创建对象
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
