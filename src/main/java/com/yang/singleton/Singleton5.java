package com.yang.singleton;

/**
 * 利用枚举的方式创建单例模式
 * 1、线程安全
 * 2、不延迟加载
 *
 * 由于枚举可以直接访问实例，并且天生线程安全
 */
public enum Singleton5 {
    INSTANCE;

    //任何方法
    public void whateverMethod(){}
}
