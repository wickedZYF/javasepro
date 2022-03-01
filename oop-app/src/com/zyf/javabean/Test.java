package com.zyf.javabean;

/**
 * 理解javabean，并学习其定义规范
 */
public class Test {
    public static void main(String[] args) {
        //1.调用无参数构造器创建对象
        User u =new User();
        u.setName("张羿凡吴彦祖");
        u.setHeight(185.5);
        u.setSalary(10000);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());

        //2.调用有参数构造器
        User u2 = new User("爱尔奎特",169.5,10000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
