package com.yang.proxy.dynamicProxy;

import com.yang.proxy.RealImage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自定义处理类
 */
public class ImageInvocationHandler implements InvocationHandler {
    private RealImage realImage;
    public ImageInvocationHandler(RealImage realImage){
        this.realImage = realImage;
    }

    /**
     *
     * @param proxy 代理类
     * @param method 方法
     * @param args 参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        return method.invoke(realImage,args);
    }
}
