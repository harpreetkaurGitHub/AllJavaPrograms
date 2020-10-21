package com.company.Array;

public class ByteArrayToString {

    public static void main(String[] args) {

        try {
            byte[] bytes = "Hello World".getBytes();
            String stringArray = new String(bytes);
            System.out.println(stringArray);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
