package com.company.Collectionss.ArrayListss.All;

public class FirstNonRepeated {

    public static int method(int[] array){

        for (int i=0;i<array.length;i++) {
            int j;
            for (j=0;j<array.length;j++){
                if (array[i] == array[j] && i!=j) {
                    break;
                }
            }
            if ( j == array.length){
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={1,1,33,3,3,5,6,2,2,3,4,5,5,6};
        System.out.println(method(array));
    }
}
