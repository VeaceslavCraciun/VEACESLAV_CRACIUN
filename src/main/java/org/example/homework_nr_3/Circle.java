package org.example.homework_nr_3;

public class Circle {
    float radius = 12.5F; //определяем внутри класса атрибут с именем radius
    Circle(float radius){ // конструктор

        this.radius = radius;
    }
    public static float calculateArea(float radius) {  //определяем метод с именем calculateArea()
        final var PI = 3.14;
        float area = (float) (PI * (radius * radius));
        return area;

    }
    /*
    инициализируем объект типа класса Circle,
    вызываем метод calculateArea() и выводим результат в консоль
     */
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(calculateArea(circle.radius));

    }
}