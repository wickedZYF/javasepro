package com.zyf.bean;

import javax.xml.crypto.Data;

public class Movie {
    private String name;
    private String actor;
    private double score;
    private double time;
    private double price;
    private int number;  //余票
    private Data starTime;//放映时间

    public Movie() {
    }

    public Movie(String name, String actor, double score, double time, double price, int number, Data starTime) {
        this.name = name;
        this.actor = actor;
        this.score = score;
        this.time = time;
        this.price = price;
        this.number = number;
        this.starTime = starTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Data getStarTime() {
        return starTime;
    }

    public void setStarTime(Data starTime) {
        this.starTime = starTime;
    }
}
