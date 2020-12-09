package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape){
        list.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return list.remove(shape);
    }

    public Shape getFigure(int n){
        if(n >= 0 && n < list.size()){
            return list.get(n);
        }
        return null;
    }

    public String showFigures(){
        String shapes = "";

        for(Shape shape : list){
            shapes += shape.getShapeName() + ", ";
        }

        if(shapes.length() > 2){
            shapes = shapes.substring(0,shapes.length() - 2);
        }
        return shapes;
    }

    public int getListSize(){
        return this.list.size();
    }
}
