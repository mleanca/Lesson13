package Lesson13Ex;

import java.util.List;

public class MeetingRoom {

    public List<Training> trainingAttendee;

    public MeetingRoom(List<Training> trainingAttendee) {
        this.trainingAttendee = trainingAttendee;
    }

    public void conductTraining() {
        for (Training training : trainingAttendee) {
            training.attendTraining();
        }
    }
}
