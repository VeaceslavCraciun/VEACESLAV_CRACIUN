package org.example.homework_nr_8;

public interface Animal {

    double FOOD_COAST_COEFFICIENT = 0.8;

    default double foodCosts(double income){
        return income * FOOD_COAST_COEFFICIENT;
    };

    static double cageArea(int width){
        return width * width;
    }

    void eat();

    void flapEars();

    void swim();

}
