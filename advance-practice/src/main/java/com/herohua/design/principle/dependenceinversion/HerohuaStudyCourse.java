package com.herohua.design.principle.dependenceinversion;

/**
 * @author: Jian Hua
 * @date: 2019/7/8 20:32
 **/
public class HerohuaStudyCourse {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void herohuaStudyCourse() {
        iCourse.studyCourse();
    }
}
