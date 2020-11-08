package com.company.Collectionss.QsOnCollection;

import java.util.Collections;

public class HashMap {

    public static void method() {

        java.util.HashMap<String,String> hashMap = new java.util.HashMap<String,String>();

        hashMap.put("1","helloo");
        hashMap.put("2","hello1");
        hashMap.put("3","hello2");
        hashMap.put("4","hello3");
        hashMap.put("5","hello4");
        hashMap.put("6","hello5");
        hashMap.put("7","hello6");

        System.out.println(hashMap.isEmpty()); // from Next QS

        Collections.synchronizedMap(hashMap);  // synchronised

        // Next QS

        for (String k :hashMap.keySet()) {

            System.out.println("Keys" + k + " --> " + "Values" + hashMap.get(k));
        }
    }

    public static void main(String[] args) {

        method();
    }
}