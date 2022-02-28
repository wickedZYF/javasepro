package com.zyf.practice;

import java.util.Random;

public class Test3 {
    //定义一个5位验证码，可能是数字大写字母，小写字母
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println("随机验证码："+code);

    }
    /*
    1. 定义一个方法安返回一个随机验证码，是否需要分会值类型声明String  是否需要申明形参：int n
     */
    public static String createCode(int n){
        //定义一个字符串变量记录生成的随机字符
        String code="";
        Random r= new Random();
        //2.定义一个for循环，循环n次，依次生成随机数
        for (int i = 0; i < n; i++) {
            //3.生成一个随机字符：语文大写 小写 数字（0 1 2）
            int type =r.nextInt(3);
            switch (type){
                case 0:
                    //大写字符（A 65  -  Z 65+25）（0-25）+65
                    char ch= (char) (r.nextInt(26)+65);
                    code += ch;
                    break;
                case 1:
                    //小写字符（A 97  -  Z 97+25）（0-25）+97
                    char ch1= (char) (r.nextInt(26)+97);
                    code += ch1;
                    break;
                case 2:
                    //数字字符
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
