package com.company.Stringss.Qs;

public class RemoveCharPresentIN2ndString {

    public static void method(String string,char string2,char string3){
        for (int i=0;i<string.length();i++) {
            if ((string.charAt(i) != string2)&&(string.charAt(i) != string3)){
                System.out.print(string.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String string = "India is great";
        string = string.toLowerCase();
        method(string,'i','n');
    }

}
