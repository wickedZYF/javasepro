package com.zyf.d11_interface_implements;

public class PingPongMan implements SportMan,Law{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println("运动员要遵纪守法");
    }

    @Override
    public void run() {
        System.out.println("运动员要训练跑步");

    }

    @Override
    public void competition() {
        System.out.println("运动员要参加比赛");

    }
}
