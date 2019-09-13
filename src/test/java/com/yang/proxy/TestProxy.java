package com.yang.proxy;

import com.yang.proxy.dynamicProxy.ImageInvocationHandler;
import com.yang.proxy.staticProxy.ProxyImage;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestProxy {
    @Test
    public void testStatic(){
        Image image = new ProxyImage("hello_world.java");
        image.dispaly();
    }
    @Test
    public void testDynamic(){
        RealImage realImage = new RealImage("hello_world.java");
        ImageInvocationHandler imageInvocationHandler = new ImageInvocationHandler(realImage);
        //由jdk自动创建代理类对象
        Image image = (Image) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Image.class},imageInvocationHandler);
        image.dispaly();
    }
}

