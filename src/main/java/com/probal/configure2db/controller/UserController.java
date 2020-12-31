package com.probal.configure2db.controller;

import com.probal.configure2db.model.user.User;
import com.probal.configure2db.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/add_users")
    public List<User> addUsers() {
        List<User> userList = Arrays.asList(
                new User(11, "Ahamed"),
                new User(12, "Rashid"),
                new User(13, "Probal")
        );
        return userService.saveUsers(userList);
    }

}
