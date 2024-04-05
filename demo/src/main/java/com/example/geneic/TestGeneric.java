package com.example.geneic;

import com.alibaba.fastjson.JSON;
import netscape.javascript.JSObject;

public class TestGeneric<E> {

    public void a(E e){

    }

    public <T> void b(T t){

    }

    public static void main(String[] args) {
        TestGeneric<String> testGeneric = new TestGeneric<>();
        testGeneric.a("123");
        testGeneric.b("123");
        System.out.println(JSON.toJSONString(testGeneric));
    }

}
