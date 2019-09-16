package com.yang.composite;

import org.junit.Test;

public class TestComposite {

    @Test
    public void test1(){
        AbstractFile f1,f2,f3,f4;
        Folder folder = new Folder("我的文档");
        f1 = new ImageFile("我的图片");
        f2 = new TextFile("我的小说");
        f3 = new VideoFile("我的视频");

        folder.add(f1);
        folder.add(f2);
        folder.add(f3);
        //天然的递归，
        folder.killVirus();
    }
}
