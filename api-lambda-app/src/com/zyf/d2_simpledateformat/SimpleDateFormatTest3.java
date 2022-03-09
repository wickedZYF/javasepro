package com.zyf.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {
        //1.开始和结束时间
        String startTime="2021-11-11 00:00:00";
        String endTime="2021-11-11 00:10:00";

        //2.俩人

        String jia="2021-11-11 00:03:47";
        String pi="2021-11-11 00:10:12";

        //解析他们的时间

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(startTime);
        Date d2=sdf.parse(endTime);
        Date d3=sdf.parse(jia);
        Date d4=sdf.parse(pi);

        if (d3.after(d1)&&d3.before(d2)){
            System.out.println("jia秒杀成功");
        }else {
            System.out.println("jia秒杀失败");
        }
        if (d4.after(d1)&&d4.before(d2)){
            System.out.println("pi秒杀成功");
        }else {
            System.out.println("pi秒杀失败");
        }
    }
}
