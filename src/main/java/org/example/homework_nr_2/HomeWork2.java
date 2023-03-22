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
        System.out.println();
        System.out.println("Цикл который отображает в консоль все числа от 100 до 1000 которые делятся на 5");

        for (int i = 100; i <=1000; i++) {
           if (i%5 == 0) System.out.println(i);
        }
        System.out.println();
        System.out.println("написать цикл(ы), который(е) отображает(ют) в консоль сумму следующей серии:"
        + "1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99");

        double sum = 0.0;
        double n;
        for (n = 1.0; n!=97.0; n+=2.0)
            sum += n/(n + 2);
        {
            System.out.println("Сумма арифметической прогрессии равна: " + sum);

        }

        System.out.println();
        System.out.println("Бонус:");

        int i, j;
            for(i = 0; i<= 8; i++){
            for (j = 0; j<=i; j++)
                System.out.print("*");
            System.out.println();
          }
        }
    }

