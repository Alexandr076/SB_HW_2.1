package ru.alexandr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.alexandr.model.User;
import ru.alexandr.repository.Authorities;
import ru.alexandr.service.AuthorizationService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService authorizationService;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Validated User user) {
        return authorizationService.getAuthorities(user);
    }

    @GetMapping("/bye")
    public String getBye() {
        return "Just bye!!";
    }

    @GetMapping("/hello")
    public String getJustHello(@Validated User user) {
        return "Just hello!";
    }
}