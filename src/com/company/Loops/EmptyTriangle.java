package com.company.Loops;

public class EmptyTriangle {

    public static void main(String[] args) {

        int i,j,k,m,n,l;

        for (i=1 ; i<=5 ; i++) {
            for (j=4 ; j>=i ; j--) {
                System.out.print(" ");
            }
            for (k=1 ; k<=i ; k++) {
                if (i>=2 && k>1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            for (l=2 ; l<=i ; l++) {
                if (i>=2 && j<i-1) {
                    System.out.println(" ");
                }
                else {
                    System.out.println("*");
                }
            }
            System.out.println();
        }
    }
}
