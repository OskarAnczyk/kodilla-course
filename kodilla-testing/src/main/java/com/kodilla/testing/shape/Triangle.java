package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shapeName;
    private double height;
    private double base;

    public Triangle(String shapeName, double height, double base) {
        this.shapeName = shapeName;
        this.height = height;
        this.base = base;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return height * base * 0.5;
    }
}
