package com.kodilla.testing.shape;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("TDD: Shapes Test Suite")
public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Tests for adding and removing")
    class TestAddRemove {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 2);
            //When
            boolean result = shapeCollector.addFigure(circle);
            //Then
            assertTrue(result);
        }
        @Test
        void TestAddingSameShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 2);
            //When
            shapeCollector.addFigure(circle);
            boolean result = shapeCollector.addFigure(circle);
            //Then
            assertFalse(result);
        }
        @Test
        void TestRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 2);
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            assertTrue(result);
        }
        @Test
        void TestRemoveShapeNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 2);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            assertFalse(result);
        }
    }
    @Nested
    @DisplayName("Tests on list")
    class TestFiguresList {
        @Test
        void TestGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 2);
            shapeCollector.addFigure(circle);
            //When
            Shape figure = shapeCollector.getFigure(0);
            //Then
            assertEquals(circle, figure);
        }
        @Test
        void TestShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("circle", 2);
            Shape square = new Square("square", 2);
            Shape triangle = new Triangle("triangle", 2, 6);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            String result = shapeCollector.showFigures();
            //Then
            assertEquals("circle square triangle ", result);
        }
    }
}
