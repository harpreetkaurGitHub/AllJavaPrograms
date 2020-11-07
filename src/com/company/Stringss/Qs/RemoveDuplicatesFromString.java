package com.company.Stringss.Qs;

public class RemoveDuplicatesFromString {

    public static String method(String string){
        String str = new String();
        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if (str.indexOf(c)<0) {
                str += c;
            }
            else {
                System.out.print(c);
            }
        }
        System.out.println(" : duplicates");
        return "Removed duplicates :: "+str;
    }

    public static void main(String[] args) {
        String string = "code of the duplicates";
        System.out.println(method(string));
    }
}
