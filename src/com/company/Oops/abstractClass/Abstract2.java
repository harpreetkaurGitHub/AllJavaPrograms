package com.company.Oops.abstractClass;

public class Abstract2 extends Abstract {

    public void bird() {
        System.out.println("This is birds method");
    }
    @Override
    public void legs() {
        System.out.println("All birds have two legs");
    }

    public static void main(String[] args) {

        Abstract obj = new Abstract2();
        Abstract2 obj1 = new Abstract2();
        obj.bird();

    }
}
