package com.zyf.d5_map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 认识map体系
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //创建一个map集合对象
        //Map<String,Integer> maps=new HashMap<>();
        Map<String,Integer> maps=new LinkedHashMap<>();
        maps.put("鸿星尔克",3);
        maps.put("Java",1);
        maps.put("枸杞",100);
        maps.put("Java",100);
        maps.put(null,null);

        System.out.println(maps);
    }
}
