package org.example.homework_nr_9;

public class EmployeeDemo {
    public static void main(String[] args) {

        Manager manager = new Manager("Mircea ", "Eliade", 10);
        Programmer programer = new Programmer("Lucian ", "Blaga", 30);

        manager.interview();
        manager.training();
        programer.training();

        Employee[] employeeArray = new Employee[] {manager, programer};
        for (Employee element: employeeArray) {
            if (element instanceof Interviewable)
                ((Interviewable) element).interview();
        }
        MeetingRoom meeting = new MeetingRoom(employeeArray);
        meeting.AttenTraining();

    }
}
