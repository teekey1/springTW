package com.codecool.springTW.controllers;


import com.codecool.springTW.models.User;
import com.codecool.springTW.services.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void removeUser(@PathVariable Long id) {
        userService.removeUser(id);
    }
}
