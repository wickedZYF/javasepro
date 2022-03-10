package com.zyf.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        //需求：校验qq号，必须全部数字6-20位
        System.out.println(checkQQ("25142689999"));
        System.out.println(checkQQ("2514268a9999"));
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("2514"));
        //正则表达式初体验
        System.out.println("--------------------------");
        System.out.println(checkQQ2("25142689999"));
        System.out.println(checkQQ2("2514268a9999"));
        System.out.println(checkQQ2(null));
        System.out.println(checkQQ2("2514"));
    }

    public static boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        //1.判断qq号码长度是否满足需求
        if(qq==null || qq.length()<6 || qq.length()>20){
            return false;
        }
        //2.判断qq中是否全部是数字，不是返回false
        for (int i = 0; i < qq.length(); i++) {
            //获取qq字符
            char ch=qq.charAt(i);
            //判断这个字符是否不是数字，不是数字直接返回false
            if (ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
}
