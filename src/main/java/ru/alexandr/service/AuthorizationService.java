package ru.alexandr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.alexandr.exceptions.InvalidCredentials;
import ru.alexandr.exceptions.UnauthorizedUser;
import ru.alexandr.model.User;
import ru.alexandr.repository.Authorities;
import ru.alexandr.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {
    @Autowired
    UserRepository userRepository;

    public List<Authorities> getAuthorities(String userName, String password) {
        if (isEmpty(userName) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(userName, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + userName);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}