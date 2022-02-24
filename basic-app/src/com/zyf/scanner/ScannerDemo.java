package com.zyf.scanner;
//1.导包操作(并不需要自己写，通过工具导入更方便)

import javax.xml.transform.Source;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //目标:学会键盘录入
        //2.都到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        //3.使用sc对象的功能等待接收用户输入的数据
        //这个代码会等待用户输入数据，直到用户输入完整数据并按了回车键就会把数据拿到。
        System.out.println("请您输入您的年龄：");
        int age= sc.nextInt();
        System.out.println("您的年龄是："+age);

        System.out.println("请输入您的名称：");
        String name= sc.next();
        System.out.println("欢迎"+name);


    }
}
