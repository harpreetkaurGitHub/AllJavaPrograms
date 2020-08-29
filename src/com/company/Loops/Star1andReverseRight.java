package com.company.Loops;

public class Star1andReverseRight {

    public static void main(String[] args) {
        int i,j,k,l,m;

        for (i=1;i<=5;i++) {
            for (j=4;j>=i;j--) {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1;i<=5;i++) {
            for (m=1;m<=i;m++) {
                System.out.print(" ");
            }
            for (l=4;l>=i;l--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
