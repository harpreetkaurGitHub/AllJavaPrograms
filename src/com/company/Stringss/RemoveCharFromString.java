package com.company.Stringss;

import java.util.Objects;

public class RemoveCharFromString {

    public static String removeChar(String value) {

        String finalValue = null;
        char[] inputValue = null;
        try {
            if (Objects.isNull(value) || value.isEmpty()) {
                throw new NullPointerException("Null or empty string");
            }

            String[] split = value.split(" ");
            finalValue = split[1];
            inputValue = split[0].toCharArray();

            for (int i=0 ; i<inputValue.length ; i++) {
                if (finalValue.contains(Character.toString(inputValue[i]))) {
                    finalValue=finalValue.replace(Character.toString(inputValue[i]),"");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
        return finalValue;
    }

    public static void main(String[] args) {

        String name = "Hello Harpreet";
        System.out.println("Input String = "+name+"\n output String = "+removeChar(null));
    }
}
