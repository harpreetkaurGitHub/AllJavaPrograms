package com.company.Stringss;

public class EqualtooMethods {

    public static void main(String[] args) {

        String obj1 = new String("Hello");
        String obj2 = new String("Hello");

        String obj3 = "same object";
        String obj4 = "same object";

        System.out.println(obj1==obj2);
        System.out.println("object 1 hashcode " + obj1.hashCode());
        System.out.println("object 2 hashcode " + obj2.hashCode());

        System.out.println("object 1 identity hashcode " + System.identityHashCode(obj1));
        System.out.println("object 2 identity hashcode " + System.identityHashCode(obj2));


        System.out.println(obj3==obj4);
        System.out.println("object 3 hashcode " + obj3.hashCode());
        System.out.println("object 4 hashcode " + obj4.hashCode());

        System.out.println("object 3 identity hashcode " + System.identityHashCode(obj3));
        System.out.println("object 4 identity hashcode " + System.identityHashCode(obj4));

        System.out.println(".equals method() 'object 1 and obj2' "  + obj1.equals(obj2));
        System.out.println(".equals method() 'object 3 and obj4' "  + obj4.equals(obj3));
    }
}
