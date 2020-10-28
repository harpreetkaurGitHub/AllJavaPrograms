package com.company.InterviewQues;

import java.util.Scanner;

public class AlternativeString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number to iterate");
        int loop =scanner.nextInt();
        for(int i = 0;i<=loop;i++){
           String value = scanner.nextLine();
            alternateString(value);
        }
    }

    public static void alternateString(String value){
        char[] charArray = value.toCharArray();
        int counter = 0;
        for(int i = 0;i<charArray.length-1;i++){
            if(charArray[i] ==charArray[i+1]){
                counter =counter+1;
            }
        }
        System.out.println(counter);
    }

}
