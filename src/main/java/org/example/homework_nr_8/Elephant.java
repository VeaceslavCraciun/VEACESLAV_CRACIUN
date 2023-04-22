package org.example.homework_nr_8;

public class Elephant extends Herbivore implements Animal {
    @Override
    public double foodCosts() {
        return Animal.super.foodCosts();
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats fruits");
    }

    @Override
    public void flapEars() {
        System.out.println("Elephant flaps his ears");
    }

    @Override
    public void swim() {
        System.out.println("Elephant can swim");

    }
    static double cageArea(int width){
        return width * width;
    }

    @Override
    void run() {
        System.out.println("Runs slowly");
    }
}
