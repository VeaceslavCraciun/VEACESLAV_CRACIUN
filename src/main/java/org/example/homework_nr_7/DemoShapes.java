package org.example.homework_nr_7;

public class DemoShapes {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println("The area of the circle is equal to " + circle.getArea());

        Square square = new Square(4);
        System.out.println("The area of the square is equal to " + square.getArea());

        Sphere sphere = new Sphere(20.5);
        System.out.println("The volume of the sphere is equal to " + sphere.getVolume());

        Cube cube = new Cube(15);
        System.out.println("The volume of the cube is equal to " + cube.getVolume());
    }
}
