package com.springzzc.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by Administrator on 2018/5/23.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello(){
        LoggerFactory.getLogger(HelloController.class).info("hello");
        return Mono.just("<h1>Hello World!</h1>");
    }
}
