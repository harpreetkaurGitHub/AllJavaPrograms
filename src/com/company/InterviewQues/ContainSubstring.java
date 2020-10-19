package com.company.InterviewQues;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainSubstring {

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

//    static String twoStrings(String a, String b) {
//        int s1Length = a.length()-1;int s2Length = b.length()-1;
//        for (int i = 0; i <s2Length; i++) {
//            if (a.contains(Character.toString(b.charAt(i)))) {
//                return "YES";
//            }
//        }
//        return "NO";
//    }
        static boolean isAnagram(String a, String b) {
            String s1 = a.replaceAll("\\s", "");
            String s2 = b.replaceAll("\\s", "");
            boolean status = true;
            if (s1.length() != s2.length()) {
                status = false;
            } else {
                 status= s1.equalsIgnoreCase(s2);
            }
            if (status) {
                return true;
            }
            return false;
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

            String s1 = "anagram";
            String s2 = "margana";
//            String result = twoStrings(s1,s2);
//            System.out.println(result);
            System.out.println(isAnagram(s1,s2));



//
//            wouldyoulikefries
//                    abcabcabcabcabcabc
//            hackerrankcommunity
//                    cdecdecdecde
//            jackandjill
//                    wentupthehill
//            writetoyourparents
//                    fghmqzldbc




        }
    }

