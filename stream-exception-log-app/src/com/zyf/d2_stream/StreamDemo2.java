package com.zyf.d2_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 目标：Stream流的获取

 Stream流式思想的核心：
 是先得到集合或者数组的Stream流（就是一根传送带）
 然后就用这个Stream流操作集合或者数组的元素。
 然后用Stream流简化替代集合操作的API.

 集合获取流的API:
 (1) default Stream<E> stream();

 小结：
 集合获取Stream流用: stream();
 数组：Arrays.stream(数组)   /  Stream.of(数组);
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        /** --------------------Collection集合获取流-------------------------------   */
        Collection<String>list=new ArrayList<>();
        Stream<String> s=list.stream();
        /** --------------------Map集合获取流-------------------------------   */
        Map<String,Integer> maps=new HashMap<>();
        //键流
        Stream<String> KeyStream=maps.keySet().stream();
        //值流
        Stream<Integer> valueStream=maps.values().stream();
        //键值对
        Stream<Map.Entry<String,Integer>>KeyAndValueStream=maps.entrySet().stream();


        /** ---------------------数组获取流------------------------------   */
        String[] names= {"赵敏","小昭","灭绝","周芷若"};
        Stream<String> namesStream =Arrays.stream(names);

        Stream<String> namesStream2= Stream.of(names);
    }
}
