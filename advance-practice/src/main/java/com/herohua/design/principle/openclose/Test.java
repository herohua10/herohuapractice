package com.herohua.design.principle.openclose;

/**
 * @author: Jian Hua
 * @date: 2019/7/7 8:33
 **/
public class Test {

    public static void main(String[] args) {

        ICourse iCourse = new JavaDiscountCourse(11, "Java从入门到放弃", 279.8);

        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;

        System.out.println("课程id:" + iCourse.getId() + "，课程名称:" + iCourse.getName() + "，课程价格:" + javaDiscountCourse.getOriginalPrice() + "，折后价格:" + iCourse.getPrice());
    }
}
