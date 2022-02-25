package com.zyf.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
        //定义死循环
//        for (;;){
//            System.out.println("hhhhhh--");
//        }

//        while (true){
//            System.out.println("快乐的的死循环");
//        }

//        do {
//            System.out.println("快乐的的死循环");
//        }while(true);

        //1.定义正确的密码
        int okPassword =520;
        //2.定义一个死循环让用户不断输入密码认证
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请输入正确密码：");
            int password =sc.nextInt();
            //3.if判断代码是否正确
            if (password==okPassword){
                System.out.println("登陆成功了");
                break;
            }else {
                System.out.println("密码错误");
            }
        }
    }
}
