package com.zyf.practice;

public class Test2 {
    public static void main(String[] args) {
        //找素数
        //定义一个循环，找到101-200之间的全部数据
        for (int i = 101; i <=200 ; i++) {
            //信号位：标记
            boolean flag=true;
            for (int j = 2; j < i/2; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(i+"\t");
            }

        }
    }
}
