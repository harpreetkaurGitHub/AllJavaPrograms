package com.company.Stringss.Qs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheWordsInSentance {
        public static String reverseWords (String sentence){
            List<String> words = Arrays.asList(sentence.split("\\s"));
            Collections.reverse(words);
            StringBuilder sb = new StringBuilder(sentence.length());
            for (int i = words.size() - 1; i >= 0; i--) {
                sb.append(words.get(i));
                sb.append(' ');
            }
            return sb.toString().trim();
        }
        public static String reverseString(String line){
            if (line.trim().isEmpty()) {
                return line;
            }
            StringBuilder reverse = new StringBuilder();
            String[] sa = line.trim().split("\\s");
            for (int i = sa.length - 1; i >= 0; i--) {
                reverse.append(sa[i]);
                reverse.append(' ');
            }
            return reverse.toString().trim();
        }
    public static void main(String args[]) {
        System.out.println(reverseWords("hello how are you"));
        System.out.println(reverseString("hello how are you"));
    }
    }
