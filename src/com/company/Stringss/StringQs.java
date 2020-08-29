package com.company.Stringss;

public class StringQs {

    public static void printNum(int num,int zero) {
//     don't print  -->   (15,20,45,60,70)

//        for (int i=0 ; i<=num ; i++) {
//
//            if (i!=15 && i!=20 && i!=45 && i!=60 && i!=70) {
//
//                System.out.println(i);
//            }
//
//        }

        if (zero < num) {
            if (zero!=15 && zero!=20 && zero!=45 && zero!=60 && zero!=70) {

                System.out.println(zero);
            }


            zero= zero +1;

            printNum(num,zero);

        }
    }


    public static void main(String[] args) {

//Q1

//        printNum(100,0);

//Q2

        String str = "Tannu Loves India";
        System.out.println(str.replace(" ",""));

//Q3

        System.out.println("substring 1 parameter" + " " +str.substring(2));
        System.out.println("substring 2 parameter" + " " + str.substring(4,7));

//Q4

        String splitStr = "Tooba tobaa sara mood kharab kr dia";

        String[] splitString =  splitStr.split("");
        System.out.println(splitString);

        String[] splitString2 = str.split("tannu",2);
        System.out.println(splitString2);

//Q5

        System.out.println(splitStr.charAt(12));

//Q6

        String[] splitMera = splitStr.split("mera");
        String uff = splitMera[0];
        char[] uffArray = uff.toCharArray();

        char[] newStringArray = splitStr.toCharArray();

        for (int i = 0; i<uffArray.length ; i++) {
            System.out.println(newStringArray[i]);
        }
//Q7

        System.out.println(splitStr.replaceAll("sara","mera"));
        System.out.println(splitStr.replaceAll("sara(.)","mera"));
        System.out.println(splitStr.replaceAll("sara(.*)","mera"));
        System.out.println(splitStr.replaceAll("(.*)sara(.*)","mera"));


    }
}