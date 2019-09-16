package com.yang.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
}

/**
 * 叶子
 */
class ImageFile implements AbstractFile{

    private String fileName;

    public ImageFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("对图片文件"+fileName+"进行杀毒");
    }
}
class TextFile implements AbstractFile{

    private String fileName;

    public TextFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件"+fileName+"进行杀毒");
    }
}

class VideoFile implements AbstractFile{

    private String fileName;

    public VideoFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("对视频文件"+fileName+"进行杀毒");
    }
}
class Folder implements AbstractFile{

    private String fileName;
    private List<AbstractFile> files = new ArrayList<>();

    public Folder(String fileName){
        this.fileName = fileName;
    }

    public boolean add(AbstractFile abstractFile){
        return files.add(abstractFile);
    }
    public boolean remove(AbstractFile abstractFile){
        return files.remove(abstractFile);
    }

    public AbstractFile get(int i){
        return files.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹"+fileName+"进行杀毒");

        for (AbstractFile a : files){
            a.killVirus();
        }
    }
}
