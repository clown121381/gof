package com.yang.prototype;

/**
 * 原型模式又叫克隆模式
 * 从已有的对象克隆出新的对象可以减少创建对象的损耗
 * 是用于创建重复的对象，同时又能保证性能。这种类型的
 * 设计模式属于创建型模式，它提供了一种创建对象的最佳方式
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。
 * 当直接创建对象的代价比较大时，则采用这种模式
 */
public class Ship implements Cloneable {
    private String name;
    private int age;
    private String id;
    private String hashCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ship(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.hashCode = String.valueOf(super.hashCode());
    }

    @Override
    protected Ship clone() throws CloneNotSupportedException{
        Ship ship = (Ship) super.clone();
        return ship;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", hashCode='" + hashCode + '\'' +
                '}';
    }
}
