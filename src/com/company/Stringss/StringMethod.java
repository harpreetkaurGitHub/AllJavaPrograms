package com.company.Stringss;

public class StringMethod {

    public static boolean stringContains(String harpreet,String tannu) {
        return harpreet.contains(tannu);
    }

    public static int stringindexOf(String value,String regex) {
        return value.indexOf(regex);
    }

    public static int stringindexOf(String value,char regex) {
        return value.indexOf(regex);
    }

    public static void main(String[] args) {

        String intro = "Hi my name is Tannu";

    //        intro.equalsIgnoreCase();

        String[] output = {"hi","my","name","is","tannu"};

        String[] array = intro.split(" ");

        char[] charAyyar = array[0].toCharArray();

        System.out.println(charAyyar[0]);

        intro=intro+" " + intro.replace("Tannu","Harpreet");
        System.out.println();

        System.out.println(stringContains(intro,"name"));
        System.out.println(stringindexOf(intro,'a'));

    }
}