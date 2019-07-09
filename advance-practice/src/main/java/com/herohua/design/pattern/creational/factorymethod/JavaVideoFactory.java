package com.herohua.design.pattern.creational.factorymethod;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 22:08
 **/
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
