package com.workshop.controller;

import com.workshop.domain.User;
import com.workshop.domain.UserDTO;
import com.workshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public UserDTO getUsersBy() {
        return userService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getUserByID(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @PostMapping
    public @ResponseBody User saveUser(User user){
        return userService.saveUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.delete(id);
    }
}
