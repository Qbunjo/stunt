package pl.jakalski.stunt.security;

public class CurrentUserServiceForTests implements CurrentUserService {

    private final String currentUser;

    public CurrentUserServiceForTests(String currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public String retrieveUsername() {
        return currentUser;
    }
}
