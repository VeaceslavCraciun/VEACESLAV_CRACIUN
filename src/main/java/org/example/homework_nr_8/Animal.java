package org.example.homework_nr_8;

public interface Animal {

    default double foodCosts(double income){
        return income * 0.8;
    };

    static double cageArea(int width){
        return width * width;
    }

    void eat();

    void flapEars();

    void swim();

}
