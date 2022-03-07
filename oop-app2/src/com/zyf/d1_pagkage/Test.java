package com.zyf.d1_pagkage;

import com.zyf.d1_pagkage.demo1.Animal;
import com.zyf.d1_pagkage.demo1.Cat;

public class Test {
    //导包，相同包下的类可以直接访问
    public static void main(String[] args) {
        Student s=new Student();

        //不同包下的类必须导包才可以使用
        Animal a=new Animal();

        //默认使用导包的类，demo1
        Cat c1=new Cat();
        c1.run();

        //指定使用demo2下的cat类
        com.zyf.d1_pagkage.demo2.Cat c2=new com.zyf.d1_pagkage.demo2.Cat();
        c2.run();

    }
}
