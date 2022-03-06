package com.zyf.d11_extends_methodoverride;

public class NewPhone extends Phone{
    /**
     * 方法重写
     */
    @Override
    public void call(){
        super.call();
        System.out.println("支持视频通话");
    }

    @Override
    public void sendMessage(){
        super.sendMessage();
        System.out.println("支持发送图片和视频");
    }
}
