package com.zyf.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球模型
 */
public class Test7 {
    public static void main(String[] args) {
        //1.随机6个红球号码（1-33），随机一个篮球号码（1-16），可以采用数组装起来作为中奖号码
             int[] luckNumber = creatLuckNumber();

        //2.调用一个方法让用户输入7 个号码，作为用户换号
        int[] userNumbers = userInputNumber();

        //3.判断中奖情况
        judge(luckNumber,userNumbers);
    }


    public static void judge(int[] luckNumber,int[] userNumber){
        //判断是否中奖了
        //1.定义两个变量分别存储红球命中的个数，以及篮球命中的数量
        int redHitNumbers =0;
        int blueHitNumbers =0;

        //2.判断红球命中了几个，开始统计
        for (int i = 0; i < userNumber.length-1; i++) {
            for (int j = 0; j < luckNumber.length-1; j++) {
                //每次找到相等了，意味着当前号码命中了
                if (userNumber[i]==luckNumber[i]){
                    redHitNumbers++;
                    break;
                }
            }
        }
        //篮球号码是否中奖了
        blueHitNumbers = luckNumber[6]==userNumber[6]?1:0;

        System.out.println("中奖号码是：");
        printArray(luckNumber);
        System.out.println("您投注号码是：");
        printArray(userNumber);
        System.out.println("您名中了几个红球："+ redHitNumbers);
        System.out.println("您是否名中篮球:"+ (blueHitNumbers == 1? "是":"否"));

        //判断中奖情况
        if(blueHitNumbers == 1 && redHitNumbers<3){
            System.out.println("恭喜你，中了5元小奖");
        }else if (blueHitNumbers == 1 &&redHitNumbers ==3
                ||blueHitNumbers ==0 &&redHitNumbers==4){
            System.out.println("恭喜你，中了10元小奖");
        }else if (blueHitNumbers == 0 &&redHitNumbers ==5){
            System.out.println("恭喜你，中了200元奖");
        }else if (blueHitNumbers == 1 &&redHitNumbers ==5){
            System.out.println("恭喜你，中了3000元大奖");
        }else if (blueHitNumbers == 0 &&redHitNumbers ==6){
            System.out.println("恭喜你，中了500万元超级大奖");
        }else if (blueHitNumbers == 1 &&redHitNumbers ==6){
            System.out.println("恭喜你，中了1000万元巨奖，开始享受人生");
        }else {
            System.out.println("感谢您为福利事业做出的突出贡献！！");
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();//换行
    }


    public static int[] userInputNumber(){
        //a.定义一个数组存储7个数
        int[] numbers=new int[7];
        //b.让用户录入6个红球号码
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println("请您输入第"+(i+1)+"个红球号码（1-33），不要重复：");
            int data=sc.nextInt();
            //c.把当前输入的数据存入到数组中去
            numbers[i]=data;
        }
        //d.单独录入一个篮球号码
        System.out.println("您您输入篮球号码（1-16）：");
        numbers[6]=sc.nextInt();
        return numbers;
    }


    public static int[] creatLuckNumber(){
        //a.定义一个动态数组，存储7个数字
        int[] numbers =new int[7];
        //b.遍历数组，为每个位置生成对应编号（注意：遍历前6个位置，生成6个不重复的红球号码，范围是1-33）
        Random r=new Random();
        for (int i = 0; i < numbers.length-1; i++) {
            //为当前位置找出一个不重复的1-33之间的数字
            while(true){
                int data =r.nextInt(33)+1;//1-33=====>(0-32)+1
        //c.注意，必须判断当前随机的这个号码之前是否出现过，出现过要随机一个，直到不重为止
                //定义一个flag变量，默认data是没有重复的
                boolean flag=true;
                for (int j = 0; j < i; j++) {
                    if(numbers[j]==data){
                        //data这个数据之前出现过不能用
                        flag=false;
                        break;
                    }
                }
                if (flag){
                    //data这个数据之前没出现过
                    numbers[i]=data;
                    break;
                }
            }
        }
        //d.为第七个位置生辰一个1-16的号作为篮球号码
        numbers[numbers.length-1] = r.nextInt(16)+1;
        return numbers;
    }



}
