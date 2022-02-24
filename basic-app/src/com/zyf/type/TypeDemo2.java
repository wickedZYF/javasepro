package com.zyf.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //目标：掌握表达式的自动类型转换
        byte a=10;
        int b=20;
        double c=a+b;
        double rs=a+b+c;
        System.out.println(rs);

        double rs2=a+b-2.3;
        System.out.println(rs2);

        //面试题
        byte i=100;
        byte j=120;
        int k =i+j;
        System.out.println(k);

    }
}
