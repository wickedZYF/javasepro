package com.zyf.d10_extends_field_method;

import java.nio.file.attribute.AclEntryFlag;

public class ExtendsDemo2 {
    public static void main(String[] args) {

        Student s=new Student();
        s.run();
        System.out.println("-------------");
        s.go();
    }
}


class People{
    public void run(){
        System.out.println("可以跑");
    }
}

class Student extends People{

    public void run(){
        System.out.println("学生跑得快");
    }

    public void go(){
        run();
        super.run();
    }
}
