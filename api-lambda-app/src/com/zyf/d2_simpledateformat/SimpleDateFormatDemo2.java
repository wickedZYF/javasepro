package com.zyf.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //目标：学会使用simpleDateFormat解析字符串成为日期对象
        //有一个时间2021年8月6日11：11:11往后2天14时49分06秒后的时间是多少
        //1.把字符串时间拿到程序中来
        String dateStr ="2021年08月06日 11:11:11";
        //2.吧字符串时间解析为时间对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d=sdf.parse(dateStr);
        //3.往后走
        long time=d.getTime()+(2L*24*60*60 + 14*60*60 + 49*60 + 6)*1000;

        //4.格式化这个时间毫秒值就是结果
        System.out.println(sdf.format(time));
    }
}
