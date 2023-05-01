package org.example.homework_nr_9;

public class Manager extends Employee implements Interviewable, Trainingable {

    public Manager(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    @Override
    public void interview() {
        System.out.println(this.name + this.surname + " conducts an interview");
    }

    @Override
    public void training() {
        System.out.println(this.name + this.surname + " conducts training");
    }
}
