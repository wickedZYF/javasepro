package com.zyf.d2_modifier.itcast;

public class Demo {
    public static void main(String[] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu f = new Fu();
//        f.show1(); // 私有的
        f.show2();
        f.show3();
        f.show4();
    }
}
