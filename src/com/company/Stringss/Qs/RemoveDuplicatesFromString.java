package com.company.Stringss.Qs;

public class RemoveDuplicatesFromString {

    public static String method(String string){
        String str = new String();
        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if (str.indexOf(c)<0) {
                str += c;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String string = "codecode";
        System.out.println(method(string));
    }
}
