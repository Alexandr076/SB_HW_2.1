package ru.alexandr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.alexandr.model.User;
import ru.alexandr.repository.Authorities;
import ru.alexandr.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService authorizationService;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        System.out.println("i was here");
        return authorizationService.getAuthorities(userName, password);
    }
}