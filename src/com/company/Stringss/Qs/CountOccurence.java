package com.company.Stringss.Qs;

public class CountOccurence {

    public static void method(char character,String givenString) {
        int otherChar = 0, occurnceOdChar =0;
        for (int i=0 ; i<givenString.length() ; i++) {
            char abc = givenString.charAt(i);
            if (abc == character) {
                occurnceOdChar++;
            }
            else {
                otherChar++;
            }
        }
        System.out.println("a charachter occured :: " + occurnceOdChar + " times");


        // Map Use hoga ismain
    }
    public static void main(String[] args) {
        method('a',"hi hapreet hi uff kitni garmi hai yaar");
    }
}
