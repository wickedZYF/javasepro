package com.zyf.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //1.整型数组的元素默认值都是0
        int[] arr=new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[9]);

        //2.字符数组的元素默认值都是0
        char[] ch=new char[10];
        System.out.println((int) ch[0]);
        System.out.println((int) ch[7]);

        //1.浮点型数组的元素默认值都是0.0
       double[] doubles=new double[10];
        System.out.println(doubles[2]);
        System.out.println(doubles[5]);

        //1.布尔型数组的元素默认值都是false
        boolean[]booleans=new boolean[10];
        System.out.println(booleans[1]);
        System.out.println(booleans[5]);

        //1.引用型数组的元素默认值都是null
        String[] names=new String[90];
        System.out.println(names[0]);
        System.out.println(names[89]);

    }
}

