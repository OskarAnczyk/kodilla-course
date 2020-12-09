package com.kodilla.testing.shape;

public class Circle implements Shape{
    private String shapeName = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return radius * 3.14;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
