package ru.alexandr.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
//    @NotNull
//    @NotBlank
//    @Size(min = 3, max = 12)
    private String userName;

//    @NotNull
//    @NotBlank
//    @Size(min = 4, max = 99)
    private String password;

    public User(String user, String password) {
        this.userName = user;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
