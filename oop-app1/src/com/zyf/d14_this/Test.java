package com.zyf.d14_this;

public class Test {
    public static void main(String[] args) {
        Student s1= new Student("王亮","清华大学");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2=new Student("王亮");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());

    }
}
