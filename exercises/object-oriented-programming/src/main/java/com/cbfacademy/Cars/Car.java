package com.cbfacademy.Cars;

public class Car {
 
    private String make;
    private String model;
    private int year;
// Constructors
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
//Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}
