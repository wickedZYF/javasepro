package com.zyf.d4_polymorphic_test;
//        定义一个USB的接口（申明USB设备的规范必须是：可以接入和拔出）。
//        提供2个USB实现类代表鼠标和键盘，让其实现USB接口，并分别定义独有功能。
//        创建电脑对象，创建2个USB实现类对象，分别安装到电脑中并触发功能的执行。

public class Test {
    public static void main(String[] args) {

        //1.创建电脑对象
        Computer c=new Computer("外星人");
        c.start();

        //2.创建鼠标对象，键盘对象
        USB u=new KeyBoard("双飞燕");
        c.installUSB(u);
        USB u1=new Mouse("罗技鼠标");
        c.installUSB(u1);
    }
}
