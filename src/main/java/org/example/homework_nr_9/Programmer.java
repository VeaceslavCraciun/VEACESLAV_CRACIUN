package org.example.homework_nr_9;

public class Programmer extends Employee implements Trainingable {

    public Programmer(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    @Override
    public void training() {
        System.out.println(this.name + this.surname + " conducts training");
    }
}
