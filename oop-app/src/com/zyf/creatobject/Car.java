package com.zyf.creatobject;

public class Car {
    //属性（成员变量）
    String name;
    double price;

    //行为
    public void start(){
        System.out.println(name+",价格是："+price+"启动了");
    }public void run(){
        System.out.println(name+",价格是："+price+"跑得很快");
    }

}
