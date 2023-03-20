package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("switch-case");
        int month = 4;
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
        System.out.println("Цикл который отображает в консоль все числа от 100 до 1000 которые делятся на 5");

        for (int i = 100; i <=1000; i++) {
           if (i%5 == 0) System.out.println(i);
        }
        System.out.println();
        //написать цикл(ы), который(е) отображает(ют) в консоль сумму следующей серии:
        // 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
        int a, b;
        for (a = 1, b = 3; a!=97; a+=2, b+=2) {
            System.out.println(a + b);

        }

        //Бонус: Используйте комбинацию из System.out.println и System.out.print
        // и циклы для вывода на экран следующей фигуры

    }
}
