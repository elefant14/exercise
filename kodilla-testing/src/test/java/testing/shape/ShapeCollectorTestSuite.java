package testing.shape;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3) {
            @Override
            public String getShapeName() {
                return null;
            }

            @Override
            public double getField() {
                return 0;
            }
        };
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3) {
            @Override
            public String getShapeName() {
                return null;
            }

            @Override
            public double getField() {
                return 0;
            }
        };
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
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

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3) {
            @Override
            public String getShapeName() {
                return null;
            }

            @Override
            public double getField() {
                return 0;
            }
        };
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}

