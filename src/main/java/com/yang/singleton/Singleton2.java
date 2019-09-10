package com.yang.singleton;

/**
 * 饿汉式创建单例模式
 * 1、线程不安全（可以在方法上加锁来确保线程安全）
 * 2、延迟加载
 */
public class Singleton2 {
    //静态成员变量不进行初始化
    private static Singleton2 instance;
    //私有化构造方法
    private  Singleton2(){}
    //提供访问类实例的方法 实现线程安全需要在方法上加synchronized关键字
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
