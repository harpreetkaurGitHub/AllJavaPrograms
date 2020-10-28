package com.company.InterviewQues;

import javax.sound.midi.Soundbank;
import java.util.*;

public class HighSecurityString {

    public static void main(String[] args) {
        System.out.println(checkSecurity("mzbmweyydiadtlcouegmdbyfwurpwbpuvhifnuapwyndmhtqvkgkbhtytszotwflegsjzzszfwtzfpnscguemwrczqxycivdqnky", 15));
    }

    public static int checkSecurity(String value, int weight) {
        weight = weight - 1;
        Map<Character, Integer> occuranceMap = new HashMap<>();
        occuranceMap.put('b', (weight + 2) > 26 ? 0 : (weight + 2));
        occuranceMap.put('c', (weight + 3) > 26 ? 0 : (weight + 3));
        occuranceMap.put('d', (weight + 4) > 26 ? 0 : (weight + 4));
        occuranceMap.put('e', (weight + 5) > 26 ? 0 : (weight + 5));
        occuranceMap.put('f', (weight + 6) > 26 ? 0 : (weight + 6));
        occuranceMap.put('g', (weight + 7) > 26 ? 0 : (weight + 7));
        occuranceMap.put('h', (weight + 8) > 26 ? 0 : (weight + 8));
        occuranceMap.put('i', (weight + 9) > 26 ? 0 : (weight + 9));
        occuranceMap.put('j', (weight + 10) > 26 ? 0 : (weight + 10));
        occuranceMap.put('k', (weight + 11) > 26 ? 0 : (weight + 11));
        occuranceMap.put('l', (weight + 12) > 26 ? 0 : (weight + 12));
        occuranceMap.put('m', (weight + 13) > 26 ? 0 : (weight + 13));
        occuranceMap.put('n', (weight + 14) > 26 ? 0 : (weight + 14));
        occuranceMap.put('o', (weight + 15) > 26 ? 0 : (weight + 15));
        occuranceMap.put('p', (weight + 16) > 26 ? 0 : (weight + 16));
        occuranceMap.put('q', (weight + 17) > 26 ? 0 : (weight + 17));
        occuranceMap.put('r', (weight + 18) > 26 ? 0 : (weight + 18));
        occuranceMap.put('s', (weight + 19) > 26 ? 0 : (weight + 19));
        occuranceMap.put('t', (weight + 20) > 26 ? 0 : (weight + 20));
        occuranceMap.put('u', (weight + 21) > 26 ? 0 : (weight + 21));
        occuranceMap.put('v', (weight + 22) > 26 ? 0 : (weight + 22));
        occuranceMap.put('w', (weight + 23) > 26 ? 0 : (weight + 23));
        occuranceMap.put('x', (weight + 24) > 26 ? 0 : (weight + 24));
        occuranceMap.put('y', (weight + 25) > 26 ? 0 : (weight + 25));
        occuranceMap.put('z', 1);

        int sum = 0;
        char[] charArray = value.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int weightChar = occuranceMap.get(charArray[i]);
            System.out.println("char :: " + charArray[i] + " weight ::" + weightChar);
            if (weightChar > 0) {
                sum = sum + weightChar;
            }
        }

        return sum;
    }
}
