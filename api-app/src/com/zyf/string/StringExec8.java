package com.zyf.string;

import java.util.Scanner;

/**
 * 手机号码屏蔽
 */
public class StringExec8 {
    public static void main(String[] args) {
        //1.键盘录入一个手机号码
        Scanner sc= new Scanner(System.in);
        System.out.println("请您输入您的手机号码：");
        String tel=sc.next();

        //2.截取号码的前三位，后四位
        String before = tel.substring(0,3);
        String after = tel.substring(7);
        String s=before+"****"+after;
        System.out.println(s);
    }
}
