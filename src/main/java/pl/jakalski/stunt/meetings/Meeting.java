package pl.jakalski.stunt.meetings;

import java.time.LocalDateTime;

class Meeting {

    private static int nextId = 0;
    private Integer id;
    //private String meetingTitle;
    //private LocalDateTime meetingDate;
    //private String meetingSpecs;

    Meeting() {
        nextId++; //nextId gets increased
        id = nextId; //creates new Id
    }

    Integer getId() {
        return id;
    }

}
