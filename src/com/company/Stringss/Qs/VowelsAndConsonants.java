package com.company.Stringss.Qs;

public class VowelsAndConsonants {

    public static void recusionMethod(String string) {
        int consonats=0; int vowels=0; int i=0;
        string = string.toLowerCase();
        char ch = string.charAt(i);

        if (i < string.length()-1) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else {
                consonats++;
            }
        }
        i++;
        recusionMethod(string);
    }

//    public static void method(String string) {
//        int consonants=0,vowwls = 0 ;
//        for (int i=0 ; i<string.length() ; i++) {
//            string = string.toLowerCase();
//            char ch = string.charAt(i);
//
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                vowwls++;
//            }
//            else {
//                consonants++;
//            }
//        }
//        System.out.println("Vowels is :: " + vowwls);
//        System.out.println("Consonants is :: " + consonants);
//    }

    public static void main(String[] args) {

//        method("Hi Harpreet and Tell about you");
        recusionMethod("Hi Harpreet and Tell me about you");
    }
}

// todo 1. recursion
