package com.yang.state;

/**
 * 上下文类
 */
public class HotelContext {
    private State state;

    public void setState(State state) {
        this.state = state;
        //设置状态并且执行方法
        this.state.Handler();
    }
}
