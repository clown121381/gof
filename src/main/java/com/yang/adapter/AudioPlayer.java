package com.yang.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if("mp3".equals(audioType)){
            System.out.println("原生播放器支持播放MP3");
        }else if("mp4".equals(audioType) || "vlc".equals(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("暂不支持");
        }
    }
}
