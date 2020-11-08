package com.company.Oops.Access;
public class Array {
    public static void method(){
        int[] array = new int[]{1,3,6,7,8,9};
        int var=0;
        for (int i=0;i<array.length-1;i++){
            if (array[i]<array[i+1]){
                var = array[i];
                array[i] = array[i+1];
                array[i+1]=var;
            }
        }
        for (int i=0;i<array.length ;i++){
            System.out.println(array[i]);
        }
    }
//    public static void method() {
//        String string1 = "Harpreet";
//        char c = 't';
//
//        if (string1 == null) {
//            System.out.println("string not found");
//        }
//        for (int i=0 ;i<string1.length() ; i++) {
//            if (string1.charAt(i)==c) {
//                System.out.println(" charachter c is in the string");
//            }
//            else {
//                System.out.println("not found");
//            }
//        }
//    }
    public static void main(String[] args) {
        method();
    }
}


