package com.yang.memento;

/**
 * 源发器类
 *
 */
public class Emp {
    private String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp() {
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //备忘操作 原文->副本
    public EmpMemento memeto(){
        return new EmpMemento(this);
    }
    //数据恢复  副本->原文
    public void recovery(EmpMemento empMemento){
        this.name = empMemento.getName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

}
