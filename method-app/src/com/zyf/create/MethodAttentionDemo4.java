package com.zyf.create;

public class MethodAttentionDemo4 {
    //方法的编写顺序无所谓
    public static  int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        //输出调用
        System.out.println(sum(10,20));
        //直接调用(只是调用方法，让方法跑一下，但返回结果不要了)
        sum(100,23);

        //无返回值的方法只能直接调用以下
        print();
        //方法之间是平级关系，不能嵌套定义，不能把方法写在main方法里面

        //方法返回值为void，不能用return
    }

    public static void print(){
        for (int i=0;i<3;i++) {
            System.out.println("买了块和田玉，是貔貅");
        }
    }

}
