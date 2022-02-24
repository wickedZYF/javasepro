package com.zyf.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：+号做连接符识别
        int a=5;
        System.out.println("abc"+'a');
        System.out.println("abc"+a);
        System.out.println(5+a);
        System.out.println("abc"+5+'a');
        System.out.println(15+"abc"+15);
        System.out.println(a+'a');
        System.out.println(a+""+'a');
        System.out.println(a+'a'+"不响丸拉");
        System.out.println("不响丸拉"+a+'a');
        System.out.println("不响丸拉"+(a+'a'));

    }
}
