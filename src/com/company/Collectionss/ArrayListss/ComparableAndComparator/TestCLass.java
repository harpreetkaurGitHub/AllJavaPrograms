package com.company.Collectionss.ArrayListss.ComparableAndComparator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCLass {

//    static int alternatingCharacters(String s) {
//        int delete=0;
//        char[] stringChar = s.toCharArray();
//        for (int i=0 ; i<stringChar.length;i++) {
//            if (stringChar[i] == stringChar[i+1]) {
//                delete++;
//            }
//        }
//        return delete;
//    }

//    static int pairs(int k, int[] arr) {
//        int diffrence = 0;
//        for(int i=0;i<arr.length-1;i++) {
//            diffrence = arr[i + 1] - arr[i];
//            diffrence = -diffrence;
//        }
//        if (diffrence != 2) {
//        }
//        return diffrence;
//    }

    static String twoStrings(String s1, String s2) {
        int s1Length = s1.length(); int s2Length = s2.length(); String found = "";

        for (int i=0; i<= s1Length-1;i++) {
            if (s1.regionMatches(i,s2,0,s2Length)) {

            }
        }
        return found;
    }



    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        String big = scanner.next();
//        int big2 = scanner.nextInt();
//        scanner.close();
//
//        BigInteger obj,obj2,obj3,obj4;
//
//        obj = new BigInteger("big");
//        obj2 = new BigInteger("big2");
//
//        obj3 = obj.add(obj2);
//        obj4 = obj.multiply(obj2);
//
//        System.out.println(obj3);
//        System.out.println(obj4);



//        BigInteger num,obj1,obj2; boolean b1;
//
//        obj1 = new BigInteger(num);
//
//        b1 = obj1.isProbablePrime(1);
//
//        if (b1==true) {
//            System.out.println("prime");
//        }
//        else {
//            System.out.println("not prime");
//        }


//        Scanner scanner = new Scanner(System.in);
//        int index = scanner.nextInt();
//        int num = scanner.nextInt();
//        scanner.close();
//
//        List<Integer> list = new ArrayList<Integer>();
//
//        num = list.get(index);
//        list.add(index,num);
//        list.remove(index);
//
//        System.out.println(list);
//        substring = s1.substring(i,i+s2Length);

        String s1 = "hello";
        String s2 = "world";
        twoStrings(s1,s2);


    }
}
