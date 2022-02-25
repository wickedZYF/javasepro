package com.zyf.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        int heart =30;
        if(heart<60 ||heart >100){
            System.out.println("您的心跳数为："+heart+"，您可能需要进一步检测");
        }

        double money=1;
        if (money>=1234){
            System.out.println("发红红包成功");
        }else{
            System.out.println("穷狗就别发红包了");
        }

        int a=99;
        if (a>=0&&a<60){
            System.out.println("您的效绩是：C");
        }else if (a>=60&&a<80){
            System.out.println("您的效绩是：B");
        }else if (a>=80&&a<90){
            System.out.println("您的效绩是：A");
        }else if (a>=90&&a<=100){
            System.out.println("您的效绩是：A+");
        }else{
            System.out.println("输入有问题");
        }
    }
}
