package com.yang.adapter;

/**
 * 适配器模式
 * 用于是不同类之间适配协调工作
 *
 *
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
