package com.zyf.arraylist;

import javax.xml.transform.Source;
import java.util.ArrayList;

/**
 * 掌握ArrayList常用API
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//JDK1.7后，泛型后面的类型可以不写
        list.add("java");
        list.add("java");
        list.add("mysql");
        list.add("mybatis");
        list.add("html");
//       1. public E get(int index) 返回指定索引处的元素
        String e= list.get(3);
        System.out.println(e);

//       2. public int size() 返回集合中的元素的个数
        System.out.println(list.size());

//       3.完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//       4. public E remove(int index) 删除指定索引处的元素，返回被删除的元素
        System.out.println(list);//[java, java, mysql, mybatis, html]
        String e2=list.remove(2);
        System.out.println(e2);
        System.out.println(list);


//       5. public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        System.out.println(list.remove("mybatis"));
        System.out.println(list);

        ArrayList<String> list1=new ArrayList<>();
        list1.add("java");
        list1.add("王宝强");
        list1.add("java");
        list1.add("上大分");
        //只会删除第一次出现的这个元素，后面的不删除
        System.out.println(list1.remove("java"));
        System.out.println(list1);


//       6. public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
         String e3=list1.set(0,"不响丸拉");
        System.out.println(e3);
        System.out.println(list1);

    }
}
