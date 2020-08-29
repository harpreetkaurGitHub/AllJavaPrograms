package com.company.Stringss.Qs;

public class Palindrome {

    public static void recursionPalindrom(String string){
        int i=0; int j=string.length()-1;
        if (i<j) {
            if (string.charAt(i) == string.charAt(j)) {
                System.out.println("it is palindrom");
            }
            else {
                System.out.println("it is not palindrom");
            }
            recursionPalindrom(string.substring(1,string.length()-1));
        }
    }

    // this this from recursion
//    public static void method(String string) {
//        int i=0 ; int j = string.length()-1;
//
//        while (i<j) {
//            if (string.charAt(i) == string.charAt(j)) {
//                System.out.println("it is palindrome");
//                i++; j--;
//            }
//            else {
//                System.out.println("it is not");
//            }
//        }
//    }
    public static void main(String[] args) {
//        method("abba");
        recursionPalindrom("ssabbryass");
    }
}

// todo 1. recursion
