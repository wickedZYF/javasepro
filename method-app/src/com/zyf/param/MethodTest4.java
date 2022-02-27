package com.zyf.param;

public class MethodTest4 {
    public static void main(String[] args) {
        //从整型数组找那个查询某个数据的索引返回，不存在该数据返回-1
        //3.定义数组，调用方法
        int[] arr={11,22,33,44,55,66,77};
        int index=searchIndex(arr,44);
        System.out.println("您查询的数据索引是"+index);
    }
    /**
     * 1.定义一个方法，参数接收数组，要查询的数据，返回值，整型
     */
    public static int searchIndex(int[] arr,int data){
        //2.找到该数据的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data){
                return i;
            }
        }
        return -1;//查无此元素
    }
}
