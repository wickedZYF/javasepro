package com.zyf.d7_abstract_test;

public class Test {
    public static void main(String[] args) {

        GoldCard c=new GoldCard();
        c.setMoney(10000);//父类的
        c.setName("薛牧");
        c.pay(300);

        System.out.println("余额："+c.getMoney());
    }
}
