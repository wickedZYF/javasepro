package com.zyf.string;

import java.util.Scanner;

/**
 * 模拟用户登录
 */
public class StringExec7 {
    public static void main(String[] args) {
        //1.定义城阙的登录密码和名称
        String okLoginName = "admin";
        String okPassword = "zyf";

        //2.定义一个循环，循环3次，让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("请输入登录名称");
            String loginName = sc.next();
            System.out.println("请输入登录密码");
            String password = sc.next();

            //3.判断登录是否成功
            if (okLoginName.equals(loginName)) {
                //4.判断密码是佛正确
                if (okPassword.equals(password)) {
                    System.out.println("登陆成功");
                    break;
                } else {
                    //密码错误了
                    System.out.println("您的密码不正确，还剩" + (3 - i) + "次机会");
                }
            } else{
                    System.out.println("您的登录名不正确，还剩" + (3 - i) + "次机会");
                }
            }
        }
    }

