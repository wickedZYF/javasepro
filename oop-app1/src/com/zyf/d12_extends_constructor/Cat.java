package com.zyf.d12_extends_constructor;

public class Cat extends Animal{
    public  Cat(){
        super();//写不写都有，默认的，默认就是寻找父类的无参构造器
        System.out.println("子类无参构造器被执行");
    }
    public  Cat(String n){
        System.out.println("子类cat无参构造器被执行");
    }
}
