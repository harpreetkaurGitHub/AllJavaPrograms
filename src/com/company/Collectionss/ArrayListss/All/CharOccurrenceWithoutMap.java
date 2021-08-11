package com.company.Collectionss.ArrayListss.All;

import java.util.Scanner;

public class CharOccurrenceWithoutMap {

    public static void method(String characterArray) {
        try {
            int length = characterArray.length();
            while (length > 0) {
                int count = 1;
                for (int i = 1; i < length; i++) {
                    if (characterArray.charAt(0) == characterArray.charAt(i)) {
                        count++;
                    }
                }
                if (count >= 1) {
                    System.out.println(characterArray.charAt(0) + " : " + count);
                }

                String characters = String.valueOf(characterArray.charAt(0)).trim();
                characterArray  = characterArray.replaceAll(characters,"");
                length -= count;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = scanner.nextLine();
        string = string.replaceAll(" ","").toUpperCase();
        method(string);
        scanner.close();
    }
}
