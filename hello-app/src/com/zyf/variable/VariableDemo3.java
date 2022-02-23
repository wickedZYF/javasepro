package com.zyf.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        //目标：掌握使用基本数据类型定义不同的变量。
        //1.byte字节类型  占1个字节 -128~127
        byte number =98;
        System.out.println(number);
        //byte number2=128;//报错

        //2.short短整形 占2个字节
        short money =20000;

        //3.int整型 默认类型 占4个字节（默认使用类型）
        int it=12323425;

        //4.long长整型 占8个字节
        long lg=253453455;
        //注意：随便写一个整数字面量默认是int类型的，215435342526456虽然没超过long的范围，但他超过了本身int类型的表示范围。
        //如果希望随便写一个整数字面量当成long类型，需要在其后面加L/l
        long lg2=215435342526456L;

        //5.浮点型（小数）
        //float 单精度 占4个字节
        //注意：随便写一个整数字面量默认是double类型的，如果希望随便写一个整数字面量当成float类型，需要在其后面加F/f
        float score = 98.5F;

        //6.double双精度 占8个字节
        double score2 =999.99;

        //7.字符类型：char
        char ch='a';
        char ch2='中';
        //char ch3='中国';  报错

        //8.布尔类型boolean
        boolean rs=true;
        boolean rs2=false;

        System.out.println("-------------------引用数据类型------------------------");
        String name ="西门吹雪";
        System.out.println(name);

    }
}
