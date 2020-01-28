package pl.jakalski.stunt.meetings;

class Meeting {

    private static int nextId = 0;
    private Integer id;
    private String ownerName;

    Meeting() {
       // ownerName= CurrentUserServiceImpl.retrieveUsername;
        nextId++; //nextId gets increased
        id = nextId; //creates new Id
    }

    public Integer getId() {
        return id;
    }

}
