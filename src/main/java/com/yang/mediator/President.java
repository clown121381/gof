package com.yang.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {

    private Map<String,Dept> map = new HashMap<>();

    @Override
    public void register(String dname, Dept d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
