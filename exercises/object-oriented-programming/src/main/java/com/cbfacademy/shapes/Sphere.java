package com.cbfacademy.shapes;

public class Sphere extends Shape {

   // TODO Auto-generated method stub
    double radius;

    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }
  
    @Override
    public double area() {
        double area = (4*(22/7*this.radius));
        return area;

    }
}
