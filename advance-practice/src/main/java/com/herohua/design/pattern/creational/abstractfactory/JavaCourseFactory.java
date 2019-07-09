package com.herohua.design.pattern.creational.abstractfactory;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 23:22
 **/
public class JavaCourseFactory extends CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
