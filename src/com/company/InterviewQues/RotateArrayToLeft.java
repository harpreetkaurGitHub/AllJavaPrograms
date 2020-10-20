package com.company.InterviewQues;

import java.util.ArrayList;

public class RotateArrayToLeft {
    static int[] rotLeft(int[] a, int d) {
        ArrayList<Integer> arrayList = new ArrayList<>(a.length);
        System.out.println(arrayList);
        int temp1[] = new int[a.length - d];
        int temp2[] = new int[a.length - d];
        int i, j;

        for (i = d; i < a.length; i++) {
            temp1[i] = a[i];
//            System.out.println(" 1st array :: "+temp1[i]);
//        }

            for (i = 0; i < a.length; i++) {
                a[a.length - d] = a[i];
                a[i + a.length] = a[a.length - d] + a[i];
                System.out.println(a[i + a.length]);
            }


//        for (i=0;i<d;i++){
//            temp1[i] = a[i];
//            System.out.println(" 1st array :: "+temp1[i]);
//        }
//        System.out.println(" ");
//        for (i=d;i<a.length;i++) {
//            temp2[i] = a[i];
//            System.out.println(" 3rd array :: "+temp2[i]);
//        }
//        for (i=0;i<a.length;i++) {
//            a[i] =temp2[i] + temp1[i] ;
//            System.out.println(" 4rd array :: "+a[i]);
//        }
        }
            return a;
    }
    public static void main(String[] args) {
        int[] a = {3,4,1,4,5};
        System.out.println(rotLeft(a,3));

    }
}
