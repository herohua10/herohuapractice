package com.herohua.design.pattern.creational.factorymethod;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 22:09
 **/
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
