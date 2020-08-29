package com.company.Stringss.KathySierra;

public class StringsMethods {
    public static String string1 = "airplane";
    public static String string2 = "      airplane       ";

    public static void main(String[] args) {


        System.out.println("Give the character at position 3 from string1 :: " + string1.charAt(3));

        System.out.println("Concat the  string1 :: " + string1.concat(" and car"));

        System.out.println("Equal ignore case :: " + string1.equalsIgnoreCase("AirPlanE") + "  lenght of string1 :: " + string1.length() );

        System.out.println("Replace A with a in string1 :: " + string1.replace('a','A'));

        System.out.println("Substring os string1 with 1 argument :: " + string1.substring(3));

        System.out.println("Substring os string1 with 2 argument :: " + string1.substring(2,7));

        System.out.println("Covert string to uppercase ::" + string1.toUpperCase());

        System.out.println("trim the string2 :: " + string2.trim() + "dslfkdjlk");

    }
}
