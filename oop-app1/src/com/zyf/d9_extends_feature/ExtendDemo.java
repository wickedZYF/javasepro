package com.zyf.d9_extends_feature;

public class ExtendDemo {
    public static void main(String[] args) {
        Student s=new Student();
    }

}

class People{
    private int age =21;
    private void run(){
        System.out.println("开跑");
    }
}


class Student extends People{

}