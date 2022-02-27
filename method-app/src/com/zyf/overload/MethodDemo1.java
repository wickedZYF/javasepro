package com.zyf.overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        //识别方法重载的形式，并且理解其调用流程，最后需要知道使用方法重载的好处

        fire();
        fire("岛国");
        fire("岛国",5);
    }
    public static void fire(){
        System.out.println("默认发射一枚武器给米国--");
    }public static void fire(String location){
        System.out.println("默认发射一枚武器给"+location+"--");
    }public static void fire(String location,int number){
        System.out.println("默认发射"+number+"枚武器给"+location+"--");
    }
}
