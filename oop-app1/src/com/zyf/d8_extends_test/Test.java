package com.zyf.d8_extends_test;

public class Test {
    public static void main(String[] args) {

        Student s=new Student();
        s.setName("翠花");
        s.setAge(22);
        s.setClassName("软工1802");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClassName());
        s.queryCourse();
        s.writeInfo();
    }
}
