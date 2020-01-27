package pl.jakalski.stunt.security;

import org.springframework.stereotype.Service;

@Service
class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public String retrieveUsername() {
        // we will provide correct implementation later...
        return "user01";
    }
}
