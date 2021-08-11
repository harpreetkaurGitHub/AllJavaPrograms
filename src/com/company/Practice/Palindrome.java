package com.company.Practice;

public class Palindrome {

    public static boolean palindrom(){
        String string = "afgbba"; String number = "101010";
        int j = number.length()-1,i=0;
        boolean isPalindrom = false;
           while (i<j) {
               if(number.charAt(i) == number.charAt(j)){
                   isPalindrom = true;
                   j--;i++;
               }
               else {
                   isPalindrom = false;
                   i++;j--;
               }
           }
           if (isPalindrom){
               return true;
           }
           return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrom());
    }
}

