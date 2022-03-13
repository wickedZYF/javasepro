package com.zyf.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //看看set集合的特点：HashSet LinkedHashSet TreeSet
        //无需  不重复  无索引
        HashSet<String> sets=new HashSet<>();  //一行经典代码，多态
     // Set<String> sets2=new LinkedHashSet(); 有序不重复 无索引

        sets.add("MYSQL");
        sets.add("MYSQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);

    }
}
