package com.zyf.javabean;

public class User {
    //成员变私有
    private String name;
    private double height;
    private double salary;

    //3.必须有无参数构造器（默认的）
    public User() {
    }

    //4.有参数构造器（不是必须的，可以选择）
    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }


    //2.必须提供成套的getter 和setter 方法暴露成员变量的取值和赋值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
