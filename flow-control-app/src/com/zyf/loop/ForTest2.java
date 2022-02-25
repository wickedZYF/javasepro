package com.zyf.loop;

public class ForTest2 {
    public static void main(String[] args) {
        int  sum=0;
        for (int i = 1; i <=5 ; i++) {
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("1-5的和是"+sum);
    }
}
