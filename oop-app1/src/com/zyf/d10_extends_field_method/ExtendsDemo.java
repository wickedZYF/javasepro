package com.zyf.d10_extends_field_method;

import java.nio.file.attribute.AclEntryFlag;

public class ExtendsDemo {
    public static void main(String[] args) {

        Wolf w = new Wolf();
        System.out.println(w.name);
        w.showName();
    }
}


class Animal{
    public String name="父类动物";
}

class Wolf extends Animal{
    public String name="子类动物";

    public void showName(){
        String name ="局部名称";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
