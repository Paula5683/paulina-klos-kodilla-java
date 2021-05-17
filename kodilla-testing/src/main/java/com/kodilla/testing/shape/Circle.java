package com.kodilla.testing.shape;

public class Circle implements Shape{
    private String name;
    private int r;

    public Circle(String name, int r) {
        this.name = name;
        this.r = r;
    }
    public String getShapeName() {
        return this.name;
    }
    public int getField() {
        return (int) 3.14 * this.r * this.r;
    }
}
