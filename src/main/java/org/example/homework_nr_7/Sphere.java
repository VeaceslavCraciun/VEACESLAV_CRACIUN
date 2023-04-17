package org.example.homework_nr_7;

public class Sphere extends ThreeDimensionalShape{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    double getVolume (){
        return 4 * Math.PI * (radius*radius*radius)/3;
    }
}
