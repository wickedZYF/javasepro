package com.zyf.create;
/**
 目标：能够说出使用方法的优点
 1.可以提高代码的复用性和开发效率
 2.让程序的逻辑更清晰
 */
public class MethodDemo1 {
    public static void main(String[] args) {
       //张工
        int c1=sum(10,20);
        System.out.println(c1);
        //李工
        int c2=sum(120,203);
        System.out.println(c2);
    }

    public static  int sum(int a,int b){
        int c =a+b;
        return c;
    }
}
