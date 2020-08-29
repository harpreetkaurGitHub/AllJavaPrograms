package com.company.Udemy.OOps;

public class MainCar {

    public static void main(String[] args) {
        Car carObject = new Car();
        carObject.inputModel("Jaguar");
        System.out.println("Model is " + carObject.getModel());
    }
}
