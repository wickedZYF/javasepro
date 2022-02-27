package com.zyf.param;

public class Text3 {
    public static void main(String[] args) {
        //打印任意整型的数组
        int[]ages={10,20,30,40};
        printArray(ages);
        System.out.println("---------------------------");
        int[]numbers={1,2,3,4};
        printArray(numbers);
        System.out.println("---------------------------");
        int[]number1=null;
        printArray(number1);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        if (arr !=null && arr.length>0){
        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length - 1 ){
//                System.out.print(arr[i]);
//           }else {
//                System.out.print(arr[i] + ",");
//           }
            System.out.print(i==arr.length-1 ? arr[i] : arr[i] + ",");
        }
        }
        System.out.println("]");
    }
}
