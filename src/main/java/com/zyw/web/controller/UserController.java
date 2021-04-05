package com.zyw.web.controller;

import com.zyw.domain.User;
import com.zyw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody // return file which belong to JSON.format
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("test");
        return userService.findAll();
    }

    @RequestMapping("/findOneById")
    public User findById(Integer id){
        return userService.findOneById(id);
    }

    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println("test");
        userService.updateUser(user);
    }

}
