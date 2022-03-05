package com.zyf.d7_extends;

import java.sql.SQLOutput;

public class Teacher extends People{
    /**
     * 独有行为
     */
    public void teach(){
        System.out.println("老师正在办公室摸鱼");
    }
}
