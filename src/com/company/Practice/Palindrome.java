package com.company.Practice;

public class Palindrome {

    public static void palindrom(){
        String string = "abba"; String number = "1010110101"; int j = number.length()-1,i=0;
           while (i<j) {
               if(number.charAt(i) == number.charAt(j)){
                   System.out.println("This is palindrome");
                   j--;i++;
               }
               else {
                   System.out.println("This is not a palindrome");
               }
           }
    }

    public static void main(String[] args) {
        palindrom();
    }
}

