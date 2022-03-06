package com.zyf.d13_extends_constructor2;

public class Student extends People{

    private String className;
    public Student(String name,int age,String className){
        //一定要访问父类的无参构造器
        super(name,age);
        this.className=className;
    }

    public Student(){

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
