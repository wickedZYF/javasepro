package com.zyf.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
    目标：研究集合遍历并删除元素可能出现的：并发修改异常问题。
 */
public class Test {
    public static void main(String[] args) {
        // 1、准备数据
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);
        // [黑马, Java, Java, 赵敏, 赵敏, 素素]
        //        it

        // 需求：删除全部的Java信息。
        // a、迭代器遍历删除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele=it.next();
//            if ("Java".equals(ele)){
//                //list.remove("Java");
//                it.remove(); //删除当前所在元素，并且不会后移
//            }
//        }
//        System.out.println(list);

        // b、foreach遍历删除 (会出现问题，这种无法解决的，foreach不能边遍历边删除，会出bug)
//        for (String s : list) {
//            if ("Java".equals(s)){
//                list.remove("Java");
//            }
//        }

        // c、lambda表达式(会出现问题，这种无法解决的，Lambda遍历不能边遍历边删除，会出bug)

//        list.forEach(s -> {
//            if ("Java".equals(s)){
//                list.remove("Java");
//           }
//        });

        // d、for循环(边遍历边删除集合没毛病，但是必须从后面开始遍历删除才不会出现漏掉应该删除的元素)
//        for (int i = 0; i < list.size(); i++) {
//            String ele =list.get(i);
//            if ("Java".equals(ele)){
//                list.remove("Java");
//            }
//        }
//        System.out.println(list);

        //解决方案
//        for (int i = list.size()-1; i >=0; i--) {
//            String ele =list.get(i);
//            if ("Java".equals(ele)){
//                list.remove("Java");
//            }
//        }
//        System.out.println(list);
        //解决方案2
        // [黑马, Java, Java, 赵敏, 赵敏, 素素]
        //          i
        for (int i = 0; i < list.size(); i++) {
            String ele =list.get(i);
            if ("Java".equals(ele)){
                list.remove("Java");
                i--;
            }
        }
        System.out.println(list);
    }
}
