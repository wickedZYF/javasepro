package com.zyf.loop;

public class WhileTest6 {
    public static void main(String[] args) {
        //需求：珠穆朗玛峰高度为8848860  纸张厚度0.1  折叠纸张到珠穆朗玛峰的位置，求折叠几次
        double peakHeight =8848860;
        double paperThickness =0.1;
        int count=0;

        while (paperThickness<peakHeight){
            paperThickness *= 2;
            count++;
        }
        System.out.println("折叠次数"+count);
        System.out.println("纸张最终厚度"+paperThickness);
    }
}
