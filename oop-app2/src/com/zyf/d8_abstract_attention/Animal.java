package com.zyf.d8_abstract_attention;

public abstract class Animal {
    private String name;
    public Animal(){}
    public  abstract  void run();

    public abstract void run2();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
