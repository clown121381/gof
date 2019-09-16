package com.yang.bridge;

public interface Brand {
    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("买联想电脑");
    }
}

class Hasee implements Brand{

    @Override
    public void sale() {
        System.out.println("买神州电脑");
    }
}
