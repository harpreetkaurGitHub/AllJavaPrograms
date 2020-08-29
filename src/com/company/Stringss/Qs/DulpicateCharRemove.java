package com.company.Stringss.Qs;

public class DulpicateCharRemove {

    public static void method() {
        String strings = "hi how are you";
        String duplicates = "";

        for (int i = 0; i < strings.length() - 1; i++) {
            for (int j = i + 1; j < strings.length(); j++) {
                if (strings.charAt(i) == strings.charAt(j)) {
                    char newArry = strings.charAt(j);
                    if (!duplicates.contains(String.valueOf(strings.charAt(j)))) {
                        duplicates += strings.charAt(j);
                    }
                }

            }
        }
        System.out.println("duplicates are removed :: " + duplicates);
    }

    public static void main(String[] args) {
        method();
    }
}