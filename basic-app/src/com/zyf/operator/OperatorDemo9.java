package com.zyf.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //目标，看看java是否存在优先级
        System.out.println(10>3 || 10>3 && 10<3);
        System.out.println((10>3 || 10>3) && 10<3);
    }
}
