package com.zyf.d7_abstract_test;

/**
 * 抽象父类
 */
public abstract class Card {
    private String name;
    private double money;

    /**
     *子类是一定要支付的，但是每个子类支付情况不一样，所以父类把支付定义成抽象方法，交给具体子类实现
     */
    public abstract void pay(double money);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
