package com.zyf.string;

import javax.lang.model.element.NestingKind;

public class StringDemo2 {
    public static void main(String[] args) {
        //直接双引号创建
        String name ="我爱你中国";
        System.out.println(name);

//public String() 创建一个空白字符串对象，不含有任何内容(几乎不用)
        String s1 = new String();
        System.out.println(s1);


//public String(String original) 根据传入的字符串内容，来创建字符串对象（几乎不用）
        String s2 =new String("我是中国人");


//public String(char[] chs) 根据字符数组的内容，来创建字符串对象
        char[] chars={'a','b','中','国'};
        String s3=new String(chars);
        System.out.println(s3);

//public String(byte[] chs) 根据字节数组的内容，来创建字符串对象
        byte[] bytes={97,98,99,65,66,67};
        String s4=new String(bytes);
        System.out.println(s4);


        System.out.println("-----------------------------");
        String a1="abc";
        String a2="abc";
        System.out.println(a1==a2);

        char[] chars1={'a','b','c'};
        String a3=new String(chars1);
        String a4=new String(chars1);
        System.out.println(a3==a4);

    }
}
