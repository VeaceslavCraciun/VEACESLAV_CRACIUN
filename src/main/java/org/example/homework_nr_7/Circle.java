package org.example.homework_nr_7;

public class Circle extends TwoDimensionalShape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
       return area = Math.PI * (radius * radius);
    }
}
