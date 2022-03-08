package com.zyf.d8_innerclass_annoymous;

import static java.lang.System.*;

/**
 * 目标掌握匿名内部类的使用方法
 */
public class Test2 {
    public static void main(String[] args) {
        Swimming s=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生快乐的游泳");
            }
        };
        go(s);
        System.out.println("-----------------------");
        Swimming s1=new Swimming() {
            @Override
            public void swim() {
                out.println("老师游泳贼快");
            }
        };

        go(s1);

        System.out.println("-----------------------");
        go(new Swimming() {
            @Override
            public void swim() {
                out.println("运动员游的贼快");
            }
        });
    }
    /**
     * 学生老师可以一起参加游泳比赛
     */
    public static void go(Swimming s){
        out.println("开始。。。");
        s.swim();
        out.println("结束。。。");
    }
}

//class  Student implements Swimming{
//    @Override
//    public void swim() {
//        out.println("学生自由的游泳");
//    }
//}

interface Swimming{
    void swim();
}