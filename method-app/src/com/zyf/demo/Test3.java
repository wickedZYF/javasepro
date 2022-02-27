package com.zyf.demo;

public class Test3 {
    public static void main(String[] args) {
        //需求，使用方法，支持找出任意整型数组的最大值返回
        int[] ages={24,19,43,78,34};
        int max=GetArrayMaxData(ages);
        System.out.println("最大值是："+max);
    }
    public static int GetArrayMaxData(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
