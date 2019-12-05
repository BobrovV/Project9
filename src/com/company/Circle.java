package com.company;

public class Circle extends Shape implements Formula{
    protected int x;
    protected int y;
    protected int z;

    protected int r;

    public int getR() {
        return r;
    }

    public Circle(int x, int y, int z, int r, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("draw " + getClass());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", color='" + color + '\'' +
                '}';
    }

    public void square(Object object) {
        System.out.println("Square is: " + 3.14 * r * r);
    }
}
