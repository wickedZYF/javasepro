package com.zyf.d6_singleinstance;

/**
 * 目标学会懒汉单例模式设计单例类
 */
public class SingleInstance2 {
    //1.私有构造器
    private SingleInstance2(){}

    //2.创建一个静态成员变量方法存储本类的对象，注意，此时不能初始化对象
    private static SingleInstance2 instance;//null

    //3.定义一个方法，让其他地方可以调用获取一个对象
    public static SingleInstance2 getInstance(){
        if (instance==null){
            //第一次来获取对象
            instance=new SingleInstance2();
        }
        return instance;
    }
}
