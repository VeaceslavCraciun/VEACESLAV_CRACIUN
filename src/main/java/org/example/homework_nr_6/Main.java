package org.example.homework_nr_6;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Toaster", "wifi control", 1, 3.0);
        invoice1.setQuantity(10);
        invoice1.setPrice(-500.0); //trying invalid values
        System.out.println(invoice1.getAmount());

        System.out.println("====== Using displayDate method ========");

        Date date1 = new Date(21,9,1983);
        date1.displayDate();

        System.out.println("===== Trying invalid values with displayDate method =======");
        date1.setDay(32);
        date1.setMonth(13);
        date1.setYear(-5);
        date1.displayDate();




    }
}
