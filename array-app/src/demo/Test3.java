package demo;


import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：5个1-20之间的随机数，让用户猜测，猜中提示猜中，还要输出该数据在数组中第一次出现的索引，并打印数组的内容
        //没有猜中继续

        //1.定义一个动态初始化的数组存储5个随机的1-20之间的数
        int[] data=new int[5];

        //2.动态生成5个1-20之间的随机数并存入数组中去
        Random r=new Random();
        for (int i = 0; i < data.length; i++) {
            data[i]=r.nextInt(1,21);
        }
        //3.使用一个死循环让用户进行猜测
        Scanner sc= new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请输入一个1-20之间的数：");
            int guess=sc.nextInt();
            //4.遍历数组中每个数据，看是否数据与猜测数据相同，相同代表猜中了，给出提示
            for (int i = 0; i < data.length; i++) {
                if (data[i]==guess){
                    System.out.println("恭喜你猜中了，您所猜中的索引为："+i);
                    break OUT;
                }
            }
            System.out.println("当前您所猜测的数不在，请重新猜测！");

        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }



    }
}
