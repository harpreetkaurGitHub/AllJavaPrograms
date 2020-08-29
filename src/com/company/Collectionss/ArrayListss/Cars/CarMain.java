package com.company.Collectionss.ArrayListss.Cars;

import static com.company.Collectionss.ArrayListss.Cars.Cars.addCarModel;
import static com.company.Collectionss.ArrayListss.Cars.Cars.getCarModel;

public class CarMain {

    public static void main(String[] args) {

        CarModel carModel= new CarModel("jaguar","jagua1110",1130);
        CarModel carModel1= new CarModel("BMW","bmw0",11220);
        CarModel carModel2= new CarModel("Ferrari","ferrarimo",114440);
        CarModel carModel3= new CarModel("Honda","hondai00o",1440);

        addCarModel(carModel);
        addCarModel(carModel1);
        addCarModel(carModel2);
        System.out.println(getCarModel(carModel1));

        String s1 = "spring ";
        String s2 = s1 + "summer ";
        s1.concat("fall ");
        s2.concat(s1);
        s1 += "winter ";
        System.out.println(s1 + " " + s2);
    }
}
