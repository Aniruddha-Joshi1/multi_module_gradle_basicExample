package org.example.controllerNew;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerNew {
    private final UserService userService;

    @Autowired
    public UserControllerNew(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }
}
