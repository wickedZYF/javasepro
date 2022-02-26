package demo;

public class Test5 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr={5,2,3,1};
        //         0 1 2 3

        //定义一个循环控制比较轮数
        for (int i = 0; i < arr.length-1; i++) {
            //i == 0  比较次数 3  j= 0 1 2
            //i == 1  比较次数 2  j= 0 1
            //i == 2  比较次数 1  j= 0
            //定义一个循环控制每轮比较次数
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //遍历数组输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
