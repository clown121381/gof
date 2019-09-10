package com.yang.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 利用反射坏解单例模式的例子以及解决方案
 *
 */
public class Singleton implements Serializable {
    private static final long serialVersionUID = 43860659278253164L;

    private static Singleton instance;
    private  Singleton(){
        //可以判断抛出异常来防止反射创建对象
        if(instance != null){
            throw new RuntimeException("反射创建对象");
        }
    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 防止反序列化绕过单例模式
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
