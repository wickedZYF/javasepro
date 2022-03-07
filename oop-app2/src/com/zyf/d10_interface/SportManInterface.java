package com.zyf.d10_interface;

/**
 * 接口
 */
public interface SportManInterface {
    //JDK8之前接口中只能是抽象方法和常量，没有其他成分了。
    //public static final可以不写，接口会自动为你加上
    //public static final String SCHOOL_NAME="zyf";
    String SCHOOL_NAME="zyf";

    //抽象方法
    //public abstract 可以省略不写，接口会默认为你加上
    //public abstract void run();
    void run();
}
