package com.zyf.string;

import java.util.Scanner;

public class StringAPIEqualsDemo4 {
    public static void main(String[] args) {
        //1.正确登录名和密码
        String okName="wickedhaha";
        String okPassword="123456";

        //请您输入登录名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("登录名称");
        String name=sc.next();
        System.out.println("登录密码");
        String password =sc.next();

        //判断用户输入的登录名称和密码与正确的内容是否相等
        //if(okName == name && okPassword==password){
        if(okName.equals(name) && okPassword.equals(password)){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码错误了");
        }

        //忽略大小写的api，一般用于比较验证码这些业务
        String sysCode="23AdFh";
        String code1="23aDfh";
        System.out.println(sysCode.equals(code1)); //false
        System.out.println(sysCode.equalsIgnoreCase(code1));//true
    }
}
