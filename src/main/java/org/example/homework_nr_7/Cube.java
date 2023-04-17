package org.example.homework_nr_7;

public class Cube extends ThreeDimensionalShape{
    double height;

    public Cube(double height) {
        this.height = height;
    }

    @Override
    double getVolume() {
        return height * height * height;
    }
}
