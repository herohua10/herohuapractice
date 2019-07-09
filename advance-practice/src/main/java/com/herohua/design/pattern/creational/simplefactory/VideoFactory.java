package com.herohua.design.pattern.creational.simplefactory;

import com.herohua.design.pattern.creational.factorymethod.JavaVideo;
import com.herohua.design.pattern.creational.factorymethod.PythonVideo;
import com.herohua.design.pattern.creational.factorymethod.Video;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 21:02
 **/
public class VideoFactory {

    public Video getVideo(String type) {
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("python".equals(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
