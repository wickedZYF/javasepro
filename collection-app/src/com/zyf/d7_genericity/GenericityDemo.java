package com.zyf.d7_genericity;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

/**
    目标：泛型的概述。

    什么是泛型？
        泛型就是一个标签：<数据类型>
        泛型可以在编译阶段约束只能操作某种数据类型。

    注意：
        JDK 1.7开始之后后面的泛型申明可以省略不写
    小结：
         泛型就是一个标签。
         泛型可以在编译阶段约束只能操作某种数据类型。
         泛型只能支持引用数据类型。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("java");
        list.add("java2");
        //list.add(23);

        List<String> list1=new ArrayList();
        list1.add("java");
//        list1.add(23.3);
//        list1.add(false);
        list1.add("Spring");
//        for (Object o : list1) {
//            String ele=(String) o;
//            System.out.println(ele);
//        }
        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("----------------");
        List<Object> list2=new ArrayList<>();
        list2.add("java");
        list2.add(23.3);
        list2.add(false);
        list2.add("Spring");

        //List<int> list3=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
    }
}