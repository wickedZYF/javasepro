package com.zyf.arraylist;

import javax.swing.*;
import java.util.ArrayList;

/**
 * 从集合中遍历元素且删除
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        //1.创建集合对象：存入学生成绩（98,77,66,87,79,50,100）
        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

//        for (int i = 0; i < scores.size(); i++) {
//            int score =scores.get(i);
//            if(score<80){
//                scores.remove(i);
//            }
//        }
//        System.out.println(scores);


        for (int i = scores.size()-1; i >= 0; i--) {
            int score =scores.get(i);
            if(score<80){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
