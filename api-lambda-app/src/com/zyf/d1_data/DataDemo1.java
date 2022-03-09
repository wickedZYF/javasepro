package com.zyf.d1_data;


import javax.xml.crypto.Data;
import java.util.Date;

public class DataDemo1 {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d);

        long time =d.getTime();
        System.out.println(time);
        long time1 =System.currentTimeMillis();
        System.out.println(time1);

        System.out.println("------------------");
        //1.得到当前时间
        Date d1=new Date();
        System.out.println(d1);
        //2.把时间往后走1小时121s
        long time2=System.currentTimeMillis();
        time2+=(60*60+121)*1000;
        //3.把时间毫秒值转换成对应的日期对象
        Date d2=new Date(time2);
        System.out.println(d2);

        Date d3=new Date();
        d3.setTime(time2);
        System.out.println(d3);
    }
}
