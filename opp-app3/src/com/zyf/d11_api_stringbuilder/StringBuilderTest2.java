package com.zyf.d11_api_stringbuilder;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr1=null;
        int[] arr2={11,22,33};
        int[] arr3={};

        System.out.println(toString(arr1));
        System.out.println(toString(arr2));
        System.out.println(toString(arr3));
    }

    /*
      1定义方法接受整型数组，返回数组内容形式
     */
    public static String toString(int[] arr){
        if(arr!=null){
            //2.开始拼接内容
            StringBuilder sb=new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length-1?"":",");
            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }
    }
}
