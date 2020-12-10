package com.codecool.springTW.controllers;


import com.codecool.springTW.models.User;
import com.codecool.springTW.services.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("users/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("users/{id}")
    public void removeUser(@PathVariable Long id) {
        userService.removeUser(id);
    }

    @PostMapping("/users/add")
    public void addPerson(@RequestBody User user){
        System.out.println("User added");
    }

}
