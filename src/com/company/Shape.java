package com.company;

public abstract class Shape {
    protected String color = "red";

    public Shape(String color) {
        this.color = color;
    }
    public abstract void draw();
}
