package com.company.Collectionss.ArrayListss.All;
import java.util.Scanner;

public class EqualityOFTwoArray {

    public static boolean method(int[] array1,int[] array2){
        boolean isEqual = false;
       if ((array1.length == array2.length)){
           for (int i=0;i<array1.length;i++){
               for (int j=0;j<array2.length;j++){
                   if ((array1[i] != array2[j])){
                      isEqual = false;
                   }
                   else {
                       isEqual = true;
                   }
               }
           }
       }
       else {
           isEqual =  false;
       }
       return isEqual;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter array1 Array size:");
        int size = scanner1.nextInt();
        int[] array1 = new int[size];
        for (int i=0;i<array1.length;i++) {
            System.out.print("Enter array1 elements:");
            array1[i] = scanner1.nextInt();
        }
        System.out.println("Enter array2 Array size:");
        int size2 = scanner1.nextInt();
        int[] array2 = new int[size2];
        for (int i=0;i<array2.length;i++) {
            System.out.print("Enter array2 elements:");
            array2[i] = scanner1.nextInt();
        }
        System.out.println(method(array1,array2));
//        method(array1,array2);
    }
}
