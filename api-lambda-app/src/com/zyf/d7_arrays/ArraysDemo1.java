package com.zyf.d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //学会使用Arrays的常用Api
        int[] arr={10,2,55,23,24,1000};
        System.out.println(arr);
        //1.返回数组内容
//        String rs= Arrays.toString(arr);
//        System.out.println(rs);
        System.out.println(Arrays.toString(arr));

        //2.排序的API
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3.二分搜索技术（前提数组必须排好序，否则出bug）
        int index=Arrays.binarySearch(arr,55);
        System.out.println(index);

        //返回值不存在元素的规律
        int index2=Arrays.binarySearch(arr,22);
        System.out.println(index2);
    }
}
