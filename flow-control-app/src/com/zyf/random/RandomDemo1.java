package com.zyf.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：学会使用java提供的随机数Random
        //1.导包
        //2.创建随机数对象
        Random r= new Random();
        //3.调用nextInt功能（方法）可以范返回一个整型的随机数
        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(10);//0-9不包含10
            System.out.println(data);
        }
        System.out.println("----------------------------------------------");
        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(10)+1;//1-10不包含0
            System.out.println(data);
        }

    }
}
