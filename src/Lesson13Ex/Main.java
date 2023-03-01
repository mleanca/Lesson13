package Lesson13Ex;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Svetlana", 36, 8);
        manager.conductInterview();
        manager.attendTraining();

        Programmer programmer = new Programmer("Ion", 30, "Java");
        programmer.attendTraining();

            //Manager Svetlana is conducting the interview
            //Manager Svetlana is attending the training
            //Programmer Ion is attending the training

        System.out.println();

        ArrayList<Training> trainingAttendee = new ArrayList<>();
        trainingAttendee.add(manager);
        trainingAttendee.add(programmer);

        trainingAttendee.get(0);
        trainingAttendee.get(1);

        MeetingRoom meetingRoom1 = new MeetingRoom(trainingAttendee);
        meetingRoom1.conductTraining();

        trainingAttendee.remove(0);

        MeetingRoom meetingRoom2 = new MeetingRoom(trainingAttendee);
        meetingRoom2.conductTraining();

            //Manager Svetlana is attending the training
            //Programmer Ion is attending the training
        //AFTER REMOVING ELEMENT INDEX 0 (ie. manager)
            //Programmer Ion is attending the training


        System.out.println();

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(manager);
        employeesList.add(programmer);

        for (Employee employee : employeesList) {
            if (employee instanceof Training) {
                Training trainingAttendee1 = (Training) employee;
                trainingAttendee1.attendTraining();
            }

            if (employee instanceof Interview) {
                Interview interviewer = (Interview) employee;
                interviewer.conductInterview();
            }
        }
            //Manager Svetlana is attending the training
            //Manager Svetlana is conducting the interview
            //Programmer Ion is attending the training





        //Different version but not resolved
        // lambda expression for interface using any employee object as parameter
//        Interview interview = () ->
//            System.out.println(employee.getName()] + " is conducting the interview");
//
//        interview.conductInterview(employee1); //cancelling the upcasting, because this method accepts only instances of Manager
//        //conductInterview.conductInterview(employee2); //not possible
//
//        Training training = (employee) ->
//                System.out.println(employee.getName() + " is attending the training");
//
//        training.attendTraining(employee1);
//        training.attendTraining(employee2);

    }
}
