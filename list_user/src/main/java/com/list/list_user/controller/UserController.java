package com.list.list_user.controller;

import com.list.list_user_api.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        User user = new User();
        user.setId(1);
        user.setName("小明");
        return user;
    }
}