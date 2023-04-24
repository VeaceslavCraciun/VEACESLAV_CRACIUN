package org.example.homework_nr_8;

public interface Animal {

    double foodCoastCoefficient = 0.8;

    default double foodCosts(double income){
        return income * foodCoastCoefficient;
    };

    static double cageArea(int width){
        return width * width;
    }

    void eat();

    void flapEars();

    void swim();

}
