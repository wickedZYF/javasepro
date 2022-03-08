package com.zyf.d4_polymorphic_test;

public class Computer {
    private String name;

    public void start(){
        System.out.println("电脑开机了");
    }
    public Computer(String name) {
        this.name = name;
    }

    /**
     *提供安装USB的接口
     */
    public void installUSB(USB usb){
        //多态：usb == 可能是鼠标，也可能是键盘
        usb.connect();
        //独有功能，先判断再强转
        if (usb instanceof KeyBoard){
            KeyBoard k= (KeyBoard) usb;
            k.KeyDown();
        }else if (usb instanceof Mouse){
            Mouse m= (Mouse) usb;
            m.dbClick();
        }
        usb.unconnect();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
