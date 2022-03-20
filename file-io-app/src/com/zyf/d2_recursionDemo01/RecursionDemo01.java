package com.zyf.d2_recursionDemo01;

public class RecursionDemo01 {
    public static void main(String[] args) {
            text2();
    }
    public static void text(){
        System.out.println("======test被执行=======");
        text();
    }
    public static void text2(){
        System.out.println("======test被执行=======");
        text3();
    }
    public static void text3(){
        System.out.println("======test被执行=======");
        text2();
    }

}
