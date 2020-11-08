package com.company.Collectionss.Mapss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hshmap {

    public static void method() {

        Set ne = new HashSet();

        ne.add(1);
        ne.add(1);
        ne.add(1);



        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        hmap.put(11,"A");
        hmap.put(12,"B");
        hmap.put(13,"C");
        hmap.put(14,"D");
        hmap.put(15,"E");
        hmap.put(16,"F");
        hmap.put(17,"G");
        hmap.put(18,"H");
        hmap.put(19,"I");
        hmap.put(20,"J");

        hmap.replace(15,"P");

        Set keys = hmap.keySet();

        System.out.println(keys);

        for (Object key:keys) {
            System.out.println(key +" "+ hmap.get(key));

        }
        HashMap<Integer,String> NewHmap = new HashMap<Integer, String>();

        NewHmap.putAll(hmap);
        System.out.println(NewHmap.keySet());
        System.out.println(NewHmap.values());
        System.out.println(hmap.containsKey(20));
        System.out.println(hmap.containsValue("K"));
    }

    public static void main(String[] args) {

        method();
    }
}
