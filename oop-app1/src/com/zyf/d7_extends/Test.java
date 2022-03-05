package com.zyf.d7_extends;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("西门");//父类的
        s.setAge(23);//父类的
        System.out.println(s.getAge());//父类的
        System.out.println(s.getName());//父类的
        s.study();
    }
}
