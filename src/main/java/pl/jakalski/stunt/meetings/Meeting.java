package pl.jakalski.stunt.meetings;

class Meeting {

    private static int nextId = 0;
    private Integer id;
    public LocalDateTime meetingDate;
    public String meetingSpecs;

    Meeting() {
        nextId++; //nextId gets increased
        id = nextId; //creates new Id
    }

    Integer getId() {
        return id;
    }

}
