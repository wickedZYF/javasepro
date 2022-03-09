package com.zyf.d2_simpledateformat;

import com.sun.tools.javac.Main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * simpleDateFormat简单日期格式化的使用
 * 格式化时间
 * 解析时间
 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        //格式化这个时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        //开始格式化日期对象成为喜欢的字符串形式
        String rs=sdf.format(d);
        System.out.println(rs);

        //格式化时间毫秒值
        long time=System.currentTimeMillis()+121*1000;
        String rs2=sdf.format(time);
        System.out.println(rs2);
    }
}
