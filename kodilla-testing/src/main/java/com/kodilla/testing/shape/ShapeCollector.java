package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape){
        list.add(shape);
    }

    public void removeFigure(Shape shape){
        list.remove(shape);
    }

    public Shape getFigure(int n){
        return list.get(n);
    }

    public void showFigures(){
        String shapes = "";

        for(Shape shape : list){
            shapes += shape.getShapeName() + ", ";
        }

        shapes.substring(0,shapes.length() - 2);
        System.out.println(shapes);
    }
}
