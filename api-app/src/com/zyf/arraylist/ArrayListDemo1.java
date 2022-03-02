package com.zyf.arraylist;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;

/**
 * 目标创建ArrayList对象，代表集合容器，往里面添加数据
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建ArrayList集合对象
        ArrayList list =new ArrayList();

        //2.添加数据
        list.add("java");
        list.add("java");
        list.add("mysql");
        list.add("罪与罚");
        list.add("23");
        list.add(23.5);
        list.add(false);
        list.add('中');
        System.out.println(list.add('中'));
        System.out.println(list);

        //3.给指定索引位置插入元素
        list.add(1,"哈哈");
        System.out.println(list);
    }
}
