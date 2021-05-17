package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name;
    private int sideA;
    private int height;

    public Triangle(String name, int sideA, int height) {
        this.name = name;
        this.sideA = sideA;
        this.height = height;
    }
    public String getShapeName() {
        return this.name;
    }
    public int getField() {
        return (this.sideA * this.height)/2;
    }
}
