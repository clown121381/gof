package com.yang.iterator;

/**
 * 提供一种可以便利聚合对象的方式，又称游标模式
 * 聚合对象：存储数据
 * 迭代器：遍历数据
 */
public class Main {
    public static void main(String[] args) {
        Concrete con = new Concrete();
        con.add("a");
        con.add("b");
        con.add("c");
        con.add("d");
        con.add("e");
        MyIterator it = con.createIterator();
        while (it.hashNext()){
            System.out.println(it.getCurrentObj());
            it.next();
            System.out.println(it.hashNext());
        }
    }
}
