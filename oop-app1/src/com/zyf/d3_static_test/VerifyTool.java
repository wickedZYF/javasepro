package com.zyf.d3_static_test;

import java.util.Random;

public class VerifyTool {

    /**
     * 私有构造器
     */
    private VerifyTool(){

    }
    /**
     * 静态方法
     */
    public static String createCode(int n){
        //1.使用string开发一个验证码
        String chars ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        //2.定义一个变量用于存储5位随机的字符作为验证码
        String code ="";
        //3.循环
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(chars.length());
            code +=chars.charAt(index);
        }
        return code;
    }
}
