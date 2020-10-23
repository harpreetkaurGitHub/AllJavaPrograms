package com.company.Array;

public class FirstRepeatingElement {

    public static int method(int[] array){
        int nonRepeated =0;
        for ( int i=0;i<array.length-1;i++) {
            for (int j=1;j<array.length-1;j++) {
                if (array[i] == array[j] && i!=j) {
                    nonRepeated = array[i];
                    break;
                }
            }
        }
        return nonRepeated;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(method(array));
    }
}
