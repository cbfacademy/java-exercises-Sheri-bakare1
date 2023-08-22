package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    //why this."" rather than just class
   // TODO Auto-generated method stub
    double radius;

    public Cylinder(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }
  
    @Override
    public double area() {
        double area = (4*(22/7*Math.sqrt(this.radius)));
        return area;
    }
} 
