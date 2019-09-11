package com.kodilla.testing.shape;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){

        Shape circle =new Circle( 3);
        ShapeCollector shapeCollector=new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        assertEquals(1,shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle(3);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }


    @Test
    public void testGetFigureNumber(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3);
        shapeCollector.addFigure(shape);
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape, shapeResult);
    }

    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();
        //Given
        Circle circle= new Circle(3);

        shapeCollector.addFigure(circle);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(circle);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}

