package org.example.homework_nr_8;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();

        Animal animal = elephant;
          elephant.eat();
          elephant.swim();
          elephant.flapEars();
          elephant.foodCosts(10000);

          System.out.println(Elephant.cageArea(10));

          Herbivore elephant1 = new Elephant();
          elephant1.run();
          elephant1.haveTasks();

    }
}
