package com.company.Practice;

public class SwapTwoNumbers {

    public static void swap(int i , int j){
        System.out.println( " i = 20 and j = 24 ");
        i = 20 + 24;
        j = i - 24;
        i = i - 20;
        System.out.println("i = "+i + " "  + " j = "+ j);

    }
    public static void main(String[] args) {
        int i = 20 , j = 24;
        swap(i,j);
    }
}
