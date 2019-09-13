package com.yang.proxy.staticProxy;

import com.yang.proxy.Image;
import com.yang.proxy.RealImage;

/**
 * 静态代理，代理类与实现类继承同一个接口
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void dispaly() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.dispaly();
    }
}
