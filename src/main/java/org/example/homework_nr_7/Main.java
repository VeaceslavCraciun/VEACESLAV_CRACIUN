package org.example.homework_nr_7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ion Cojocaru", "str. Cuza Voda");

        Staff staff = new Staff("Mathew Perry", "str.Bulgara");
        staff.setSchool("School \"Mircea Eliade\"");
        staff.setPay(500);

        Student student = new Student("Mircea Rotari", "str. Zelinski");
        student.setProgram("Java core");
        student.setFee(10000);
        student.setYear(4);
        System.out.println(student.toString());
        System.out.println(person);
        System.out.println(staff);


    }
}
