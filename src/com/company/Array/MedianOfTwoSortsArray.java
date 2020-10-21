package com.company.Array;
import java.util.Arrays;

public class MedianOfTwoSortsArray {

    public static void getMedian(int[] array1,int[] array2){
        int array1Length = array1.length;
        int array2Length = array2.length;
        int[] array3 = new int[array1Length+array2Length];
        System.arraycopy(array1, 0, array3, 0, array1Length);
        System.arraycopy(array2, 0, array3, array1Length, array2Length);
        int li =0;
        int hi = array3.length-1;
        int median=li+hi/2;

        for (int i=0;i<array3.length-1;i++) {
          if ((array3.length%2)==0){
              System.out.println("it has not median");
          }
          else {
              System.out.println("Median of array3 is:: " + median);
              break;
          }
        }
        System.out.println(Arrays.toString(array3));
    }

    public static void main(String[] args) {
        int[] array1 = {-5, 3, 6, 12, 15};
        int[] array2 = {-12, -10, -6, -3, 4, 10};
        getMedian(array1,array2);
    }
}
