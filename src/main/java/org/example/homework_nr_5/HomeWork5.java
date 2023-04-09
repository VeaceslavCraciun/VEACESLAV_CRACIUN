package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {

        System.out.println("=== print the names of the months ===");
        for (Months months: Months.values()) {
            System.out.println(months);
        }

        System.out.println("======== Enumeration Weekday ========");
        System.out.println(Weekday.MONDAY.isWeekDay());

        System.out.println("======== Data converting ======");
        boolean a = Boolean.parseBoolean("true");
        byte b = Byte.parseByte("123");
        short c = Short.parseShort("32000");
        int d = Integer.parseInt("147895632");
        long e = Long.parseLong("987654321987654321");
        double f = Double.parseDouble("4444.5d");
        float g = Float.parseFloat("2354.56f");

        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g);



    }
}
