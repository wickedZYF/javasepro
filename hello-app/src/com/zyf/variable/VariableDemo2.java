package com.zyf.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //1.变量要先声明再使用
        int a=23;
        System.out.println(a);

        //2.声明变量后，不能存储其他类型书记
        //a=1.5;

        //3.变量的有效范围是从定义开始到}截止，在同一个范围不能有两个相同名字的变量
        {
            int b=25;
            System.out.println(b);
          //  int b=234;
        }
        //System.out.println(b);

        System.out.println(a);
        //int a=234;
        a=234; //这里不是定义，是在赋值

        //4.变量的定义可以没有初始值，但是使用时必须给初始值
        int c;
        c=12;
        System.out.println(c);

        System.out.println("------------------------变量在计算机底层的原理----------------------");

        char ch='a';
        System.out.println(ch+1);
        System.out.println(ch);

        int i1=0B01100001;
        System.out.println(i1);

        int i2=0141;
        System.out.println(i2);

        int i3=0x61;
        System.out.println(i3);

    }
}
