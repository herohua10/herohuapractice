package com.herohua.design.pattern.creational.factorymethod;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 21:00
 **/
public class Test {

    public static void main(String[] args) {

        VideoFactory javaVideoFactory = new JavaVideoFactory();
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        VideoFactory feVideoFactory = new FEVideoFactory();

        Video javaVideo = javaVideoFactory.getVideo();
        Video pythonVideo = pythonVideoFactory.getVideo();
        Video feVideo = feVideoFactory.getVideo();

        javaVideo.produce();
        pythonVideo.produce();
        feVideo.produce();
    }
}
