package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId")Long userId){
        User user = userService.getUser(userId);
        //http://localhost:8098/contact/user/1212
        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
        user.setContacts(contacts);
        return user;
    }
}
