package com.zyf.d8_annotation;

public @interface Book {
    String value(); // 特殊属性
    double price() ;
    //double price() default 9.9;
}
