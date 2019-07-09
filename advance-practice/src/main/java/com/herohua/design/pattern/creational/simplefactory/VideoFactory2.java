package com.herohua.design.pattern.creational.simplefactory;

import com.herohua.design.pattern.creational.factorymethod.Video;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 21:17
 **/
public class VideoFactory2 {

    Video video = null;

    public Video getVideo(Class c) {

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
