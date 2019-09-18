package com.yang.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 */
public class Concrete {
    private List<String> list = new ArrayList<>();

    public void add(String s){
        list.add(s);
    }

    public void get(int index){
        list.get(index);
    }

    public MyIterator createIterator(){
        return new ConcreteIterator();
    }

    /**
     * 内部类迭代器
     */
    private class ConcreteIterator implements MyIterator {

        //游标
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor != list.size()){
                cursor++;
            }
        }

        @Override
        public boolean hashNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size()-1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }

}
