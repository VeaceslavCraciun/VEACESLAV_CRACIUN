package org.example.homework_nr_9;

public class MeetingRoom {
   Trainingable[] trainingList = new Trainingable[2];

    public MeetingRoom(Employee[] array) {
        for (Employee element : array) {
            Trainingable[] Trainingable = new Trainingable[2];
            if (element instanceof Interviewable)
                    this.trainingList = Trainingable;
        }
    }
    public void AttenTraining(){
        for (Trainingable element: trainingList)
            element.training();
    }
}
