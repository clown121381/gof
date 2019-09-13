package com.yang.adapter;

/**
 * 适配器协调两个类工作
 *
 *  实现接口MediaPlayer
 *  并且添加另一个类的成员变量
 *  advancedMediaPlayer
 *  （或者继承来实现但是成员变量的方法更好）
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equals(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equals(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
