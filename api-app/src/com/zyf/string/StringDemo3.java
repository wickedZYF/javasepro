package com.zyf.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ab";
        String s3=s2+"c";
        System.out.println(s1==s3);

        String s4="abc";
        String s5="a"+"b"+"c";
        System.out.println(s4==s5);
    }
}
