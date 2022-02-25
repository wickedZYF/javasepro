package com.zyf.random;

import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class RandomTeat2 {
    public static void main(String[] args) {
        //1.随机一个幸运号码1-100之间（0-99）+1
        Random r=new Random();
        int data=r.nextInt(100)+1;
        //2.使用一个死循环让用户不断猜测
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("请输入猜测数据：");
            int guessData=s.nextInt();

            //3.判断猜测的数据与随机数大小
            if (guessData>data){
                System.out.println("您猜测的数过大！");
            }else if (guessData<data){
                System.out.println("您猜测的数过小！");
            }else{
                System.out.println("恭喜您猜对了");
                break;//直接调出并结束死循环
            }
        }
    }
}
