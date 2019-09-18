package com.yang.mediator;

public interface Mediator {
    void register(String dname,Dept d);
    void command(String dname);
}
