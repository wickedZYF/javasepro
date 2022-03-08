package com.zyf.d4_polymorphic_test;

public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
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
    public void dbClick(){
        System.out.println(name+"请多多一键三连");
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
