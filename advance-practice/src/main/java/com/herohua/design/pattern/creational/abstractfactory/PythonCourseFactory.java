package com.herohua.design.pattern.creational.abstractfactory;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 23:23
 **/
public class PythonCourseFactory extends CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
