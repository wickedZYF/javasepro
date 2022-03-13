package com.zyf.d4_collection_test;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.sql.SQLOutput;
import java.util.*;

/**
    目标：斗地主游戏的案例开发。

    业务需求分析:
        斗地主的做牌, 洗牌, 发牌, 排序（拓展知识）, 看牌。
        业务: 总共有54张牌。
        点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        花色: "♠", "♥", "♣", "♦"
        大小王: "👲" , "🃏"
        点数分别要组合4种花色，大小王各一张。
        斗地主：发出51张牌，剩下3张作为底牌。

    功能：
        1.做牌。
        2.洗牌。
        3.定义3个玩家
        4.发牌。
        5.排序（拓展，了解，作业）
        6.看牌
 */
public class GameDemo {
    /**
      1、定义一个静态的集合存储54张牌对象
     */
    public static List<Card> allCards=new ArrayList<>();

    /**
      2、做牌：定义静态代码块初始化牌数据
     */

    static {
        //定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //定义花色：个数确定，类型确定，使用数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        //组合点数和花色
        int index=0;//记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //封装成一个牌对象
                Card c=new Card(size,color,index);
                //存入到集合容器中去
                allCards.add(c);
            }
        }
        //大小王存入集合对象中去
        Card c1=new Card("","👲",++index);
        Card c2=new Card("", "🃏",++index);
        Collections.addAll(allCards,c1,c2);
        System.out.println("新牌："+allCards);

    }


    public static void main(String[] args) {

        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后："+allCards);

        //发牌（定义3个玩家，每个玩家的牌也是一个集合容器）
        List<Card> kehong=new ArrayList<>();
        List<Card> yifan=new ArrayList<>();
        List<Card> guining=new ArrayList<>();

        //开始发牌（从牌集合中发出51张牌给3个玩家，剩余3张作为底牌）
        for (int i = 0; i < allCards.size()-3; i++) {
            //拿到当前牌对象
            Card c=allCards.get(i);
            if (i%3==0){
                //请科宏接牌
                kehong.add(c);
            }else if (i%3==1){
                //请羿凡接牌
                yifan.add(c);
            }else if (i%3==2){
                //请桂宁接牌
                guining.add(c);
            }
        }

        //拿到最后三张底牌(最后三张牌劫成一个子集合)
        List<Card> LastThreeCards =allCards.subList(allCards.size()-3,allCards.size());


        //给玩家的牌排序（从大到小排序）
        sortCards(kehong);
        sortCards(yifan);
        sortCards(guining);
        System.out.println("------------------------------------------------------------------------------------------------------");
        //输出玩家的牌
        System.out.println("科宏："+kehong);
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("羿凡："+yifan);
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("桂宁："+guining);
        System.out.println("------------------------------------------------------------------------------------------------------");


        System.out.println("三张底牌："+LastThreeCards);
    }

    /**
     * 给牌排序
     * @param cards
     */
    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex()-o1.getIndex();
            }
        });
    }
}

