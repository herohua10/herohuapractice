package com.herohua.design.pattern.creational.abstractfactory;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 23:24
 **/
public class Test {

    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();

        Video video = courseFactory.getVideo();

        Article article = courseFactory.getArticle();

        video.produce();

        article.produce();
    }
}
