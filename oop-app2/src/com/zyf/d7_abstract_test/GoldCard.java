package com.zyf.d7_abstract_test;

public class GoldCard extends Card{
    @Override
    public void pay(double money) {

        //优惠后的金额算出来
        double rs=money*0.8;
        double lastMoney =getMoney()-rs;
        System.out.println(getName()+"当前总金额："
                +getMoney()+"，当前消费了："+rs+"消费后剩余："
                +lastMoney);

        setMoney(lastMoney);//跟新账户余额
    }
}
