package com.company.Stringss.Qs;

public class Anagram {

    public static void method() {
        String string1 = "rabcd";
        String string2 = "abcd";
        try {
            if (string1 == null || string2==null) {
                throw new NullPointerException("null or empty");
            }
            else{
//                recursionMethod(0,string1,string2);
               for (int i=0 ; i<string1.length() ; i++) {
                   if (string2.contains(String.valueOf(string1.charAt(i)))) {
                       System.out.print(string1.charAt(i) + " ");
                   }
               }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void recursionMethod(int i,String string1,String string2) {
        if (i < string1.length() && i<string2.length()) {
          if(string2.contains(String.valueOf(string1.charAt(i) ))) {
              System.out.println(string1.charAt(i));
          }
            i++;
            recursionMethod(i,string1,string2);
        }
        // condion i<-mstch String size
        //get char i , match char with s2 , thn print if it matched
        // i++ thn again cll method

    }

    public static void main(String[] args) {
        method();
    }

}
