package com.zyf.encapsulation;

public class Student {
    private int age;
    /*
    取值方法 getAge
     */
    public int getAge(){
        return age;
    }


    /*
     赋值方法：setAge
     */
    public void setAge(int age){
        if (age>=0 && age <=200){
            this.age =age;
        }else{
            System.out.println("年龄违法，应该不是人的年龄！");
        }
    }
}

