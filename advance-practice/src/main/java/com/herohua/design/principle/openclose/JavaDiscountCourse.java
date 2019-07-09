package com.herohua.design.principle.openclose;

/**
 * @author: Jian Hua
 * @date: 2019/7/7 8:37
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取课程原价
     */
    public Double getOriginalPrice() {
        return super.getPrice();
    }

    /**
     * 获取课程折后价格
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
