package com.yang.state;

public interface State {
    public void Handler();
}
class FreeSate implements State{

    @Override
    public void Handler() {
        System.out.println("空闲状态");
    }
}

class BookedState implements State{

    @Override
    public void Handler() {
        System.out.println("已预定");
    }
}
class CheckedState implements State{

    @Override
    public void Handler() {
        System.out.println("已入住");
    }
}