package com.yang.proxy;

/**
 * 真实的类实现功能的类
 */
public class RealImage implements Image {

    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void dispaly() {
        System.out.println("displaying    "+fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("loading        "+fileName);
    }

}
