package com.zyf.d4_static_attention;

import com.sun.tools.javac.Main;

public class Test {
    //静态成员变量
    public static int onLinenumber;
    //实例成员变量
    private String name;

    public static void getMax(){
        //1.静态方法可以直接访问静态成员
        System.out.println(Test.onLinenumber);
        System.out.println(onLinenumber);
        inAddr();

        //3.静态方法中不能出现this关键字
       // System.out.println(this);
    }

    public  void  run(){
        //2.实例方法可以直接访问静态成员,也可以访问静态成员变量
        System.out.println(Test.onLinenumber);
        System.out.println(onLinenumber);
        Test.getMax();

        System.out.println(name);
        sing();

        System.out.println(this);
    }

    public void sing() {
        System.out.println(this);
    }

    //静态成员方法
    public static void inAddr(){
        System.out.println("我在家自学java");
    }


    public static void main(String[] args) {

    }
}
