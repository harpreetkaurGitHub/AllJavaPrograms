package com.company.Practice;

public class ReverseString {
    public static void reverseString(String string,int length){
        if (length >= 1) {
            length = length-1;
            string  = string.concat(Character.toString(string.charAt(length)));
            System.out.print(string.charAt(length));
            reverseString(string,length);
        }
    }
    public static void reverseStringByLoop(String string,int length){
        if (string.isEmpty() || string==null) {
            System.out.println("String is nul or empty");
        }
        else {
            for (int i=string.length()-1;i>-1;i--) {
                System.out.print( " "+string.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String string = "Harpreet"; int length = string.length();
        reverseString(string,length);
        reverseStringByLoop(string,length);
    }
}
