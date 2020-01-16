package pl.jakalski.stunt.meetings;

class Meeting {

    private static int nextId = 0;
    private Integer id;

    Meeting() {
        id = nextId + 1; //creates new Id
        nextId++; //nextId gets increased
    }

    Integer getId() {
        return id;
    }

}
