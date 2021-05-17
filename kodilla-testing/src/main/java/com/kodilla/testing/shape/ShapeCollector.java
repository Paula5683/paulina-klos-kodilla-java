package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public boolean addFigure(Shape shape){
        boolean result = false;
        if (!figures.contains(shape)) {
            figures.add(shape);
            result = true;
        }
        return result;
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure (int n){
        if (n >=0 && n < this.figures.size()){
            return this.figures.get(n);
        }
        return null;
    }
    public String showFigures(){
        String figuresList = "";
        for (int i = 0; i < figures.size(); i++){
            String figure = figures.get(i).getShapeName();
            figuresList += figure + " ";
        }
        return figuresList;
    }
}



