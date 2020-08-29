package com.company.Stringss.Qs;

public class ReverseAString {
    public static void reverseAString(String string) {

        try {
            if (string==null || string.isEmpty()) {
                throw new NullPointerException("it is null or empty");
            }

            if (string.equalsIgnoreCase("HellO")) {
                for (int i=string.length()-1 ; i>=0 ; i--) {
                    System.out.print(" "+string.charAt(i));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reverseAStringWithoutLoop(String string , int stringLength) {
        if (stringLength >= 1) {
            stringLength = stringLength-1;
            string = string.concat(Character.toString(string.charAt(stringLength)));
            System.out.println(string.charAt(stringLength));
            reverseAStringWithoutLoop(string,stringLength);
        }
    }

    public static void digitString(String string) {
        try {
            if (string==null || string.isEmpty()) {
                System.out.println("This string is null or Empty");
            }
            if (string.matches("[0-9]+")) {
                System.out.print("String contains only digits");
            }
            if (string.matches("sdkjfdklf")) {
                System.out.println("string contains only string characters");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String mainString = "hello Everyone";
        String digitString = "1556789";
        reverseAString("Hello");
        reverseAStringWithoutLoop(mainString , mainString.length());
        digitString(digitString);
    }
}

// todo 1. teeno Qs
