package com.zyf.d1_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //set集合去重复原因：先判断哈希值 再判断equals
        Set<Student> sets=new HashSet<>();
        Student s1=new Student("无氧",20,'男');
        Student s2=new Student("无氧",20,'男');
        Student s3=new Student("无氧",21,'男');

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);
    }
}
