package com.company.Oops.Loops;

public class Diagonal1 {

    static int row,space;

       public static void method(int num) {
           for (row = 6; row <= num+5; row++) {
               for (space = num; space >= row-5; space--) {
                   System.out.print("0");
               }
               System.out.println(" * ");
            System.out.println();
           }
       }
    public static void main(String[] args) {
       Diagonal obj = new Diagonal();

       method(5);

    }
}
