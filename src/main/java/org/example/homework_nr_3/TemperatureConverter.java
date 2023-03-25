package org.example.homework_nr_3;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        toFahrenheit(30);
        System.out.println("30 градусов Цельсия = " + toFahrenheit(30) + " градусов по Фаренгейту.");

        toCelsius(95.5);
        System.out.println("95.5 градусов по Фаренгейту = " + toCelsius(95.5) + " градусов Цельсия.");
    }
    public static double toCelsius(double F) {
        double C;
        C = (F - 32) / 1.8;
        return C;
    }
    public static double toFahrenheit(double C) {
        double F;
        F = C * 1.8 + 32;
        return F;
    }
}
