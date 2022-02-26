package com.zyf.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //学会访问数组元素
        int ages[]={12,43,32};
        //取值
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        //赋值

        ages[2]=100;
        System.out.println(ages[2]);

        //访问数组长度
        System.out.println(ages.length);
    }
}
