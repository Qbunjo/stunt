package pl.jakalski.stunt.meetings;

class Meeting {

    private static int nextId = 0;
    private Integer id;
    private String ownerName;

    Meeting(String ownerName) {
        nextId++; //nextId gets increased
        this.id = nextId; //creates new Id
        this.ownerName = ownerName;
    }

    public Integer getId() {
        return id;
    }

    public String getOwner() {
        return ownerName;
    }

}
