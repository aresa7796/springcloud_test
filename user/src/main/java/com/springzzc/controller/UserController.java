package com.springzzc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by Administrator on 2018/5/21.
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping("/user/hello")
    public Mono<String> hello(){
        logger.info("hello");
        return Mono.just("<h1>Hello World!</h1>");
    }
}
