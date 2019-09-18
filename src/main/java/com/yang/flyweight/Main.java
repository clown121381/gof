package com.yang.flyweight;



/**
 * 享元模式以共享的方式高效的支持大量细粒度对象的重用
 * 工厂
 * 内部状态：可以共享，会随着外部环境的变化而变化
 * 外部状态：不可以共享，会随着外部环境的变化而变化
 *
 * 线程池，连接池，String常量池
 *
 * 减少内存中的对象数量
 */
public class Main {
    public static void main(String[] args) {
        ChessFlyWeight c1 = ChessFlyweightFactory.getChess("black");
        ChessFlyWeight c2 = ChessFlyweightFactory.getChess("black");

        System.out.println(c1);
        System.out.println(c2);

        c1.display(new Coordinate(10,10));
        c2.display(new Coordinate(20,20));
    }
}
