package com.zyf.d1_set;

import java.awt.desktop.AboutEvent;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 观察TreeSet对有值特性的数据如何排序
 * 学会自定义类型的对象进行指定规则排序
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer>sets=new TreeSet<>();
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);

        Set<String>sets1=new TreeSet<>();
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("angela");
        sets1.add("张羿凡");
        sets1.add("About");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);
        System.out.println("------------------------------");

        //方式二：集合自带比较器对象进行规则指定
        //
        Set<Apple> apples =new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                //return o1.getWeight()-o2.getWeight();//升序
                //return o2.getWeight()-o1.getWeight();//降序
                // 注意：浮点型建议直接使用Double.compare进行比较
                return Double.compare(o2.getPrice(),o1.getPrice());//降序
            }
        });
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));
        System.out.println(apples);

    }
}
