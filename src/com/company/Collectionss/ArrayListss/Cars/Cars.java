package com.company.Collectionss.ArrayListss.Cars;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// JAGUAR --> Jaguar11o --> 70 Lakhs
// JAGUAR --> Jaguarj7o  --> 90 Lakhs

// crud method .exhandling(null,empty)

public class Cars {
    public static Map<String, Map<String,Integer>> carVehicle = new HashMap<>();

    public static void addCarModel(CarModel carModel) {
        if (Objects.isNull(carVehicle.get(carModel.getCarModel()))) {
            Map<String,Integer> carModelAndPriceMap = new HashMap<>();
            carModelAndPriceMap.put(carModel.getCarModel(),carModel.getCarPrice());
            carVehicle.put(carModel.getCarBrand(),carModelAndPriceMap);
        }else {
            carVehicle.get(carModel.getCarBrand()).put(carModel.getCarModel(),carModel.getCarPrice());

        } }
    public static Map<String, Integer> getCarModel(CarModel carModel) {
        Map<String,Integer> carModelAndPriceMap = carVehicle.get(carModel.getCarBrand());
        if (Objects.nonNull(carModelAndPriceMap.get(carModel.getCarModel()))) {
                    return carModelAndPriceMap;
        }
        return null;
    }



    public static void RemoveModelDetails(CarModel carModel3) {
        Map<String,Integer> carModelAndPriceMap = carVehicle.get(carModel3.getCarBrand());
        if (Objects.nonNull(carModelAndPriceMap.get(carModel3.getCarBrand()))) {
            carModelAndPriceMap.remove(carModel3.getCarBrand());
            carVehicle.put(carModel3.getCarBrand(),carModelAndPriceMap);
        }
    }

    public static void UpdateCarPrice(CarModel carModel) {
        Map<String,Integer> carModelAndPriceMap = carVehicle.get(carModel.getCarBrand());
        if (Objects.nonNull(carModelAndPriceMap.get(carModel.getCarModel()))) {
                        carModelAndPriceMap.put(carModel.getCarModel(),carModel.getCarPrice());
                        carVehicle.put(carModel.getCarBrand(),carModelAndPriceMap);
        }
    }

}
