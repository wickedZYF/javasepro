package com.zyf.create;

public class MethodDemo2 {
    public static void main(String[] args) {

        int rs =add(100,300);
        System.out.println("和是："+rs);

        System.out.println("---------------------------");
        int rs1 =add(200,300);
        System.out.println("和是："+rs1);

    }
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
}
