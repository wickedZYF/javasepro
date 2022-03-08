package com.zyf.d4_polymorphic_test;

public class KeyBoard implements USB{

    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/**
 * 独有功能
 */
    public void KeyDown(){
        System.out.println(name+"敲击了，来了啊，老弟");
    }
    @Override
    public void connect() {
        System.out.println(name+"成功连接了电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功从电脑拔出");
    }
}
