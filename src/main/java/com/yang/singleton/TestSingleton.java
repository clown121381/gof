package com.yang.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

public class TestSingleton {

    /**
     * 测试多线程的下的访问时间
     */
    public void testSingletonPatternOfThreads() throws InterruptedException {
        /*
         * Singleton1 172毫秒
         * Singleton2 78毫秒
         * Singleton3 94毫秒
         * Singleton4 110毫秒
         * Singleton5 109毫秒
         */
        int threadNum = 10;
        final CountDownLatch latch = new CountDownLatch(threadNum);
        long start = System.currentTimeMillis();
        for(int i = 0;i < threadNum;i ++){
            new Thread(()->{
                for(int j = 0;j < 1000;j++) {
//                    Singleton1 s = Singleton1.getInstance();
//                    Singleton2 s = Singleton2.getInstance();
//                    Singleton3 s = Singleton3.getInstance();
//                    Singleton4 s = Singleton4.getInstance();
//                    Singleton5 s = Singleton5.INSTANCE;
                }
                latch.countDown();
            },String.valueOf(i)+"：号线程").start();
        }
        latch.await();
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"毫秒");
    }

    public void testGetInstance(){
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s11 = Singleton1.getInstance();

        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();

        Singleton3 s3 = Singleton3.getInstance();
        Singleton3 s33 = Singleton3.getInstance();

        Singleton4 s4 = Singleton4.getInstance();
        Singleton4 s44 = Singleton4.getInstance();

        Singleton5 s5 = Singleton5.INSTANCE;
        Singleton5 s55 = Singleton5.INSTANCE;

        System.out.println(s1 == s11);
        System.out.println(s2 == s22);
        System.out.println(s3 == s33);
        System.out.println(s4 == s44);
        System.out.println(s5 == s55);

    }

    /**
     * 反射可以绕过单例模式
     * @throws ClassNotFoundException
     */
    public void test1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton s2 = Singleton.getInstance();

        Class<Singleton> singletonClass = (Class<Singleton>) Class.forName("com.yang.singleton.Singleton");
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton s1 = declaredConstructor.newInstance();

        //反射绕过了单例模式获取到对象
        System.out.println(s1);
        System.out.println(s2);

    }
    public void test2() throws IOException, ClassNotFoundException {

        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Singleton s2 = Singleton.getInstance();
        oos.writeObject(s2);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton s1 = (Singleton) ois.readObject();
        System.out.println(s1);
        System.out.println(s2);

    }
}
