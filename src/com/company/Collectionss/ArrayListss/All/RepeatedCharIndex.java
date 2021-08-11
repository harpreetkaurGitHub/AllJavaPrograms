package com.company.Collectionss.ArrayListss.All;


import java.util.HashSet;
import java.util.Map;

public class RepeatedCharIndex {

    public static void repeatedCharIndex(String str){
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<str.length();i++) {
            if (set.contains(str.charAt(i))){
                System.out.println("Character: "+str.charAt(i) + " Index: " + i);
            }
            else {
                set.add(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "hi darling ji";
        str = str.replaceAll(" ","").toLowerCase();
        repeatedCharIndex(str);
    }
}
