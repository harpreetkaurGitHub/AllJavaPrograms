package com.company.Stringss;

import java.util.Objects;

public class ReverseaString {

    public static String reverseString= "";
    public static void reverseStringUsingLoop(String value,String name) {
        try {
            if (value==null || value.isEmpty()) {
                throw new NullPointerException("null or empty");
            }
            for (int i=value.length()-1 ; i>=0 ; i--) {
                System.out.print(value.charAt(i));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reverseStringUsingLoop(String value) {
        try {
            if (value==null || value.isEmpty()) {
                throw new NullPointerException("null or empty");
            }
            if (value.equalsIgnoreCase("github")) {
                for (int i=value.length()-1 ; i>=0 ; i--) {
                    System.out.print(value.charAt(i));
                }
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String reverseString(String inputString , int length) {
           try {
               if (inputString==null || inputString.isEmpty()) {
                   throw new NullPointerException("null or empty");
               }
               if (length>=1) {
                   length = length-1;
                   reverseString = reverseString.concat(Character.toString(inputString.charAt(length)));
                   reverseString(inputString , length);
               }
           }
           catch (Exception e) {
               e.printStackTrace();
           }
           return reverseString;
    }

    public static void stringToChar(char[] input,int length) {
        if (length<=input.length-1) {
            System.out.println(input[length]);
            length = length+1;
            stringToChar(input,length);
        }
    }

    public static void printTheNum(int num,int zero) {
        num = num - 1;
        if (zero < num) {
            System.out.println(zero);
            zero = zero+1;
            printTheNum(num,zero);
        }

//        for (int i =0 ; i <= num ; i++) {
//            System.out.println(i);
//        }
    }

    public static void printTheNumInReverse(int num,int zero) {
//        if (zero < num) {
//            num = num - 1;
//            System.out.println(num);
//            printTheNumInReverse(num,zero);
//        }
        for (int i=num ; i >= zero ; i--) {
            System.out.println(i);
        }
    }

    public static void subStringMethod(){
        String[]  string = {"Hello How are You I am a String"};
    }


    public static void main(String[] args) {

        String name="Represent your coding skills";

        char[] arrayOfChar = name.toCharArray();

        stringToChar(name.toCharArray(),0);

        printTheNum(150,0);

        printTheNumInReverse(150,0);

        name =  name.replace("represent","show");
        System.out.println("replace methode" +name);

        System.out.println("equals to method"+name.equals("skills"));

        System.out.println("index of char s" + name.indexOf('s'));

        System.out.println("index of string  sa" + name.indexOf("sk"));

        System.out.println();

        String output=reverseString(name,name.length());
        System.out.println(output);
//
//        reverseStringUsingLoop("Tannu");

          String[]  string = {"1","2","3","4"};

          String love= string[3];

          String input ="love";

          String string2 = love.substring(0,4);

          System.out.println(love);

          String[] str3 = love.split("a",2);
        System.out.println(str3);

          String[] str4 = love.split("a");
        System.out.println(str4);

          String valueStore = str4[1];

          for (int i = 0 ; i<str4.length ; i++) {
              String str5 = str4[i];
              System.out.println(str5);
          }
    }
}
