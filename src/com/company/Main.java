package com.company;

public class Main {

    public static void main(String[] args) {
        //Shape s[] = new Shape[3];

        //s[0] = new Circle(10,10,10, 5, "black");
        //s[0].draw();

        Circle circle = new Circle(10, 10, 10, 5, "black");
        circle.draw();
        circle.square(circle.getR());
        System.out.println(circle);
    }
}
