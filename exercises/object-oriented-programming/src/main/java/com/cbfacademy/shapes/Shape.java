package com.cbfacademy.shapes;

public abstract class Shape {

    public String shapeName;

    //abstract method for the area
    public abstract double area();

    //right click to source code
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    //define the shape name 
    public String toString() {
        System.out.println("This is a " + this.shapeName);
        return this.shapeName;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("rectangle", 3,5);
        Sphere sphere1 = new Sphere("sphere", 5);
        Cylinder cylinder1 = new Cylinder("cylinder", 3);

        System.out.println(sphere1.area());

    }
}
