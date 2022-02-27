package com.zyf.retundemo;

public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("main开始");
        chu(10,0);
        System.out.println("main结束");
    }
    public static void chu(int a,int b){
        if (b==0){
            System.out.println("您输入的数据有问题，除数不能是0!");
            return;//立即弹出当前方法，并技术当前方法的执行
        }
        int c=a/b;
        System.out.println("结果是："+c);
    }
}
