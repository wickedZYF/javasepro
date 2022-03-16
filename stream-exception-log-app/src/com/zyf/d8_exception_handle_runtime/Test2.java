package com.zyf.d8_exception_handle_runtime;

import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.TreeMap;

/**
    需求：需要输入一个合法的价格为止 要求价格大于 0
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       while (true){
           try {
               System.out.println("请您输入合适的价格：");
               String priceStr=sc.nextLine();
               //转换double类型
               double price=Double.valueOf(priceStr);

               //判断价格是否大于0
               if(price >0){
                   System.out.println("定价："+price);
                   break;
               }else {
                   System.out.println("价格必是正数");
               }
           } catch (Exception e) {
               System.out.println("用户输入数据有毛病，请您输入和法价值");
           }
       }
    }
}
