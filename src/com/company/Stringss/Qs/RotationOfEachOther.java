package com.company.Stringss.Qs;

public class RotationOfEachOther {

    public static void recursionRotation(String string1 , String string2) {
        String concatString = string1.concat(string2);
        int i=0; int j= concatString.length()-1;

        if (i<j && i<string1.length() && i<string2.length()) {
            if (concatString.charAt(i) == concatString.charAt(j)) {
                System.out.println("Matched");
            }
            else {
                System.out.println("not matched");
            }
        }
        i++;j--;
        recursionRotation(string1,string2);
    }

//    public static void methd() {
//        String string1 = "ABCD";
//        String string2 = "DCBA";
//        String concatString = string1.concat(string2);
//
//        int i=0 ; int j = concatString.length()-1;
//        while (i<j) {
//            if (concatString.charAt(i) == concatString.charAt(j)) {
//                System.out.println("yes its matched");
//                i++; j--;
//            }
//            else {
//                System.out.println("do no matched");
//            }
//        }
//    }

    public static void main(String[] args) {

//        methd();
        recursionRotation("ABCD","DCBA");
    }
}
// todo 1.  not possible recursion
