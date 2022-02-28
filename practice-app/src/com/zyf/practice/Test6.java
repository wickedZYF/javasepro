package com.zyf.practice;

import java.util.Scanner;

/**
 * 需求：
 * ⚫某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，然后每位数都加上
 * 5 , 再对10求余，最后将所有数字反转，得到一串新数。
 */
public class Test6 {
    public static void main(String[] args) {
        //1.定义一个数组存入需要加密的数据
        System.out.println("请您输入需要加密的数字个数：");
        Scanner sc = new Scanner(System.in);
        int length =sc.nextInt();
        int[] arr =new int[length];

        //2.录入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入压加密的第"+(i+1)+"个数字：");
            int number=sc.nextInt();
            arr[i]=number;
        }
        //3.打印数组看一下
        printArray(arr);

        //4.核心逻辑，对数组中的数进行加密
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        //5.核心逻辑，对数组中的数进行反转

        for(int i =0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
          printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1 ? arr[i] : arr[i]+",");
        }
        System.out.println("]");
    }
}
