package com.zyf.create;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标:学会动态初始化数组的定义与使用
        double[] scores=new double[3];//[0.0,0.0,0.0]
                                      //  0   1   2
        //赋值
        scores[0]=99.5;
        System.out.println(scores[0]);
        System.out.println(scores[2]);

        String[] name=new String[90];
        name[0]="蛮王";
        name[2]="厄斐琉斯";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

    }
}
