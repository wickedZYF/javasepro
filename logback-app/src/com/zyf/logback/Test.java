package com.zyf.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 目标 快速搭建Logbcak
 */
public class Test {


    //创建logback的日志对象
    public static final Logger LOGGER= LoggerFactory.getLogger("Test.class");

    public static void main(String[] args) {

        try {
            LOGGER.debug("main");
            LOGGER.info("开始记录");
            int a=10;
            int b=0;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("出错，"+e    );
        }


    }
}
