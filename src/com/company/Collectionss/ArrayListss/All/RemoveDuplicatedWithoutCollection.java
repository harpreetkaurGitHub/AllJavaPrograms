package com.company.Collectionss.ArrayListss.All;

import java.util.Scanner;

public class RemoveDuplicatedWithoutCollection {


    public static void method(String input){
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    if (!output.contains(String.valueOf(input.charAt(i)))){
                        output+=input.charAt(i);
                    }
                }
            }
        }
        System.out.print("Duplicates removed: "+ output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        method(string);

    }

}

