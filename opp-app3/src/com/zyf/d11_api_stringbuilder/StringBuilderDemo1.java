package com.zyf.d11_api_stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(1);
        sb.append(true);
        sb.append(3.3);
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder();
        sb1.append("a").append(342).append("我爱你中国");
        System.out.println(sb1);

        sb1.reverse().append("110");
        System.out.println(sb1);
    }
}
