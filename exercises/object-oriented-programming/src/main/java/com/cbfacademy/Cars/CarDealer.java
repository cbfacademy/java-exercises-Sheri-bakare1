package com.cbfacademy.Cars;

public class CarDealer {
    public static void main(String[] args){
        Car car1 = new Car("Volvo", "V40", 2012);
        Car car2 = new Car("Porche", "Panamera", 2009);
        Car car3 = new Car("Audi", "A3", 2018); 

        //to print it out
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());


        System.out.println(car2.getModel());
        System.out.println(car3.getYear());
    }
}
