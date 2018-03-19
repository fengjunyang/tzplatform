package com.topcheer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feng on 2018/3/5.
 */
@RestController
public class HelloWorldController {
    private static Logger log = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/hello")
    public  String hello(){
        log.debug("TestA-debug");
        log.info("TestA-info");
        log.warn("TestA-warn");
        log.error("TestA-error");
    return "hehehe start";
    }
}
