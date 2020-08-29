package com.company.QsOnArrayList;

public class TestClass {
    public static void returnMultiple(int n) {

        for (int i = 1; i <= n; i++) {

            if ((i % 3) == 0) {
                System.out.println("fizz");
            }
            else if ((i % 5) == 0) {
                System.out.println("buzz");
            }
            //
            else if ((i % 5) == 0 && (i % 3) == 0 ) {
                System.out.println("fizzbuzz");
            }
            else {
                System.out.println(i);
            }
            }
    }

    public static void main(String[] args) throws Exception {

        returnMultiple(15);
    }

}
