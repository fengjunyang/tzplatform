package com.topcheer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feng on 2018/3/5.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public  String hello(){
    return "hehehe start";
    }
}
