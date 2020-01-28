package pl.jakalski.stunt.security;

public interface CurrentUserService {

    /**
     * Will return username of logged user or null if there were no authentication.
     *
     * @return id of current user.
     */
    String retrieveUsername();

}
