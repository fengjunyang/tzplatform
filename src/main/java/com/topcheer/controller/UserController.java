package com.topcheer.controller;

import com.topcheer.dao.jpa.UserRepository;
import com.topcheer.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @ApiOperation(value="查找用户", notes="根据User对象名称查找用户",response =User.class )
    @ApiImplicitParam(name = "username", value = "名称", required = true, dataType = "String",paramType = "form")
    @RequestMapping(value = "/findByUsername", method = RequestMethod.POST)
    @ResponseBody
    public User findByUsername(String username){
        return userRepository.findByUsername(username);

    }
}
