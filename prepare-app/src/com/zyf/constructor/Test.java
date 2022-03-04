package com.zyf.constructor;

public class Test {
    public static void main(String[] args) {

        User u =new User();
        System.out.println(u.getName());
        System.out.println(u.getAge());
        System.out.println(u.getAge());
        System.out.println(u.getLoginName());

        User u2= new User("陆小凤","lxf","1",34);
        System.out.println(u2.getName());
        System.out.println(u2.getAge());
        System.out.println(u2.getAge());
        System.out.println(u2.getLoginName());
    }
}
