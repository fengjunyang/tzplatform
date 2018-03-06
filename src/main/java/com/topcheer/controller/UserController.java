package com.topcheer.controller;

import com.topcheer.dao.jpa.UserRepository;
import com.topcheer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by feng on 2018/3/6.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/test")
    public String index(){
        return "/test";
    }

    @RequestMapping(value = "/findByUsername", method = RequestMethod.POST)
    @ResponseBody
    public User findByUsername(Model model,String username){
        return userRepository.findByUsername(username);

    }
}
