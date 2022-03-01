package com.zyf.creatobject;

public class Test {
    public static void main(String[] args) {
        //目标，自己设计对象并使用
        //类名 对象名 = new 类名();
        Car c =new Car();
        c.name = "奔驰GlC";
        c.price = 39.78;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
        System.out.println("-------------------------------");
        Car c2 =new Car();
        c2.price=38.93;
        c2.name="宝马x3";
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.start();
        c2.run();
    }
}
