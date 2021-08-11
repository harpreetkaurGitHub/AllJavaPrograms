package com.company.Stringss.Qs;

import java.util.HashMap;

public class FirstNonRepeated {
    public static Character method(String string) {
        String emptyString = "";
        int duplicateValue = 0;

//        int i = Integer.parseInt(string);
//      System.out.println(i);                                            Q11

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int i, length;
        Character c ;
        length = string.length();
        for (i = 0; i < length; i++) {
            c=string.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        for (i = 0; i < length; i++) {
            c = string.charAt(i);
            if (hashMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(method("IITS TOO HOT HERE"));

    }
}
