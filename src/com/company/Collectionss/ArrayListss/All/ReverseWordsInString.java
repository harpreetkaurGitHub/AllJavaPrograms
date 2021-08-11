package com.company.Collectionss.ArrayListss.All;

import java.util.Objects;
import java.util.Scanner;

public class ReverseWordsInString {

    public static String method(String string){

        String reverseString ="";
       try {
           if (string!=null && !string.isEmpty()){
               String[] string2 = string.split("//s");
               for (int i=0;i<string2.length;i++) {
                   String words = string2[i];
                   String reverseWords = "";
                   for (int j=words.length()-1;j>=0;j--) {
                       reverseWords= reverseWords + words.charAt(j);
                   }
                   reverseString= reverseString + reverseWords+" ";
               }
               return "Output: "+reverseString.toUpperCase();
           }
       }
       catch (Exception e) {
           System.out.println("Exception occurred");
           e.printStackTrace();
       }
        return "NULL OR EMPTY STRING";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
        String string = scanner.nextLine();
        System.out.println(method(string));
        scanner.close();

    }
}
