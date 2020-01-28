package pl.jakalski.stunt.meetings;

import pl.jakalski.stunt.security.CurrentUserService;

import java.time.LocalDateTime;

class Meeting {

    private static int nextId = 0;
    private Integer id;
    private String ownerName;
    //private String meetingTitle;
    //private LocalDateTime meetingDate;
    //private String meetingSpecs;

    Meeting() {
       // ownerName= CurrentUserServiceImpl.retrieveUsername;
        nextId++; //nextId gets increased
        id = nextId; //creates new Id
    }

    public Integer getId() {
        return id;
    }

}
