package com.company.Collectionss.ArrayListss.Cars;
// POJO --> PLAIN OLD JAVA OBJECT

public class CarModel {

    private String carModel;
    private String carBrand;
    private Integer carPrice;

    public CarModel(String carModelObj,String carBrandObj , Integer carPriceObj) {
        this.carModel = carModelObj;
        this.carBrand = carBrandObj;
        this.carPrice = carPriceObj;
    }

    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Integer getCarPrice() {
        return carPrice;
    }
    public Integer setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
        return carPrice;
    }
}
