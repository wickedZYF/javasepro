package com.zyf.d5_static_codeblock;

import java.util.ArrayList;

public class StaticCodeTest3 {
    /**
     * 模拟初始化牌的操作
     * 1.准备一个容器，存储54张牌对象，这个容器建议使用静态的集合，静态集合只加载一次
     */
    //int age=12;
    static ArrayList<String> cards=new ArrayList<>();

    /**
     * 在游戏开始前要准备好54张牌放进去，使用静态码进行初始化
     */
    static {
        //3.加载54张牌进去
        //4.准备4中花色：,类型确定，个数确定
        String[] colors ={"♠","♥","♣","♦"};
        //5.定义点数
        String[] sizes ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //6.先遍历点数，再组合花色
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i]+colors[j]);
            }
        }
        cards.add("大王");
        cards.add("小王");
    }

    public static void main(String[] args) {
        System.out.println("新牌："+cards);
    }
}
