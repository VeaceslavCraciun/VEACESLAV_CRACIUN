package org.example.homework_nr_7;

public class Student extends Person {

    private String Program;
    private int year;
    private double fee;

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return  "Student{" + super.toString() +
                "Program='" + Program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                "}";
    }
}
