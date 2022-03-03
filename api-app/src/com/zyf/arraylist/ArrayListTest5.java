package com.zyf.arraylist;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        //定义一个定影类：Movie
        //定义一个ArrayList集合存储这些影片
        ArrayList<Movie> movies = new ArrayList();
        //1.创建影片对象封装电影数据，吧对象加入到集合中去
//        Movie m1=new Movie("肖申克的救赎",9.7,"罗宾斯");
//        movies.add(m1);
        movies.add(new Movie("《肖申克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣"));
        movies.add(new Movie("《阿甘正传》",9.5,"汤姆.汉克斯"));

        System.out.println(movies);
        //2.遍历集合中的影片对象并展示出来
        for (int i = 0; i < movies.size(); i++) {
            Movie movie=movies.get(i);
            System.out.println("片名："+movie.getName());
            System.out.println("评分："+movie.getScore());
            System.out.println("主演："+movie.getActor());
        }
    }
}
