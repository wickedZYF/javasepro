package com.zyf.d6_singleinstance;

/**
 * 目标使用饿汉单例方法定义单例类
 */
public class SingleInstance1 {


    /**
     * 1.先把构造器私有
     */
    private SingleInstance1(){
    }

    /**
     * 2.定义一个公开的静态成员变量存储一个类的对象
     * 饿汉：在这里加载静态变量的时候就会创建对象了
     * public static int onLineNumber =161;
     */

    public static SingleInstance1 instance=new SingleInstance1();

}
