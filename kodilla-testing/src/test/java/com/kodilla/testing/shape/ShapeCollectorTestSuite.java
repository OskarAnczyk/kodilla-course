package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @Test
    void testAddShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assertions.assertEquals(1,shapeCollector.getListSize());
    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        shapeCollector.addFigure(circle);
        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(circle,retrievedShape);
    }


    @Nested
    @DisplayName("Testing removing")
    class TestRemoving {
        @Test
        void testRemoveShapeNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(1,1);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveShape(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(1);
            shapeCollector.addFigure(square);
            //When
            shapeCollector.removeFigure(square);
            //Then
            Assertions.assertEquals(0,shapeCollector.getListSize());
        }
    }

    @Nested
    @DisplayName("Testing showing")
    class TestShowing{
        @Test
        void testShowFiguresWithEmpty(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            String expected = "";
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(expected,result);
        }

        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(1);
            Circle circle = new Circle(1);
            Triangle triangle = new Triangle(1,1);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            String expected = "Square, Circle, Triangle";
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(expected,result);
        }
    }
}
