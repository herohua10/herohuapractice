package com.herohua.design.principle.dependenceinversion;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 20:33
 **/
public class Test {

    public static void main(String[] args) {

        HerohuaStudyCourse herohuaStudyCourse = new HerohuaStudyCourse();

        herohuaStudyCourse.setiCourse(new JavaCourse());

        herohuaStudyCourse.herohuaStudyCourse();
    }
}
