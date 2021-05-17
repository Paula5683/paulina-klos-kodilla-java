package com.kodilla.testing.shape;

public class Square implements Shape{
    private String name;
    private int sideA;

    public Square(String name, int sideA) {
        this.name = name;
        this.sideA = sideA;
    }
    public String getShapeName() {
        return this.name;
    }
    public int getField() {
        return this.sideA * this.sideA;
    }
}
