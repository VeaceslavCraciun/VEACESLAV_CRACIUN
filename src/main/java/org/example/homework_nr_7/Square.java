package org.example.homework_nr_7;

public class Square extends TwoDimensionalShape{

   double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width * width;
    }
}
