package com.zyf.d5_static_codeblock;

public class TestDemo1 {

    public static String schoolName;


    public static void main(String[] args) {
        //目标，学习静态代码块的特点，基本作用
        System.out.println("===========main方法执行触发被执行==========");
        System.out.println(schoolName);
    }

    /*
   与类一起加载，自动触发一次，优先执行
   作用：可以在程序加载时进行静态基本数据的初始化操作（准备内容）
    */
    static {
        System.out.println("==静态代码块被触发执行==");
        schoolName="zyf喜欢打游戏";
    }
}
