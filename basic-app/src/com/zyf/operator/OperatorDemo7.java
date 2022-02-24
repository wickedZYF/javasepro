package com.zyf.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //目标：学会使用逻辑运算符
        double size = 9.8;
        double storage =6;
        //需求：尺寸大于6.95 内存大于8GB
        //注意：必须前后都是true结果才是true
        System.out.println(size >= 6.95 & storage >= 8);

        //需求：要么尺寸大于6.95 要么内存大于8GB
        //注意：只要有一个是true结果就是是true
        System.out.println(size >= 6.95 | storage >= 8);

        System.out.println(!true);
        System.out.println(!false);

        //逻辑异或：必须有两个不同结果才是true
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^false);

        System.out.println("-----------------&&  &   ||  | 的区别---------------");
        int a=10;
        int b=20;
        System.out.println(a >100 && ++b >10);
        System.out.println(b);
        System.out.println(a >100 & ++b >10);
        System.out.println(b);

        int i=10;
        int j=20;
        System.out.println(i>2 || ++j>10);
        System.out.println(j);
        System.out.println(i>2 | ++j>10);
        System.out.println(j);

    }
}
