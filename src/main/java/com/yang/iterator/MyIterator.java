package com.yang.iterator;

public interface MyIterator {

    void first();
    void next();
    boolean hashNext();
    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();
}
