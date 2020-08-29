package com.company.Loops;

public class Star2 {
    static int row, space , triangle , triangle1;

    public static void method(int num) {
        for (row=1 ; row<=num ; row++) {
            for (space=num ; space>=row ; space--) {
                System.out.print(" ");
            }
            for (triangle=1 ; triangle<=row ; triangle++) {
                System.out.print("*");
            }
            for (triangle1=2 ; triangle1<=row ; triangle1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Star2 obj = new Star2();

        method(5);
    }
}
