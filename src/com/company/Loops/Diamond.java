package com.company.Loops;

public class Diamond {
    static int row,space,triangl1,triangle2,space1;
    public static void method(int num) {


        System.out.println("################## LOVE YOU GUYS #####################");

        for (row=4 ; row<=num+3 ; row++) {
            for (space=num ; space>row-3 ; space--) {
                System.out.print(" ");
            }
            for (triangl1=1 ; triangl1<=row-3 ; triangl1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");

        for (row=4 ; row<=num+3 ; row++) {
            for (space=num ; space>=row-3 ; space--) {
                System.out.print(" ");
            }
            for (triangl1=1 ; triangl1<=row-3 ; triangl1++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamond obj = new Diamond();

        method(5);
    }
}
