package com.company.Loops;

public class ForEach {

    public static int method(int[] marks) {

       int smallestNumber=marks[0];

       for (int num : marks) {

           if (num < smallestNumber) {
               smallestNumber = num;
           }
       }
        return smallestNumber;
    }

    public static void main(String[] args) {
        int[] marks = {12,34,24,10,20,45,67};
           int smallest= method(marks);

        System.out.println(smallest);
    }
}
