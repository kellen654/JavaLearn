package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
 /*
        List接口中常用方法：
        增加：add(int index, E element)
        删除：remove(int index)  remove(Object o)
        修改：set(int index, E element)
        查看：get(int index)
        判断：
         */
        List list = new ArrayList();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);
        list.set(3,77);
        System.out.println(list);


    }
}
