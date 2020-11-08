package com.company.Oops.Loops;

public class Diagonal {

    static int row , space ;

    public static void method(int num) {
        for (row=5 ; row<=num+5 ; row++) {

            for (space=1 ; space<=row ; space++) {

                if (row>1 && space<=row-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Diagonal obj = new Diagonal();

        method(5);

    }
}
