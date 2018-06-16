package com.springzzc.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/14.
 */
@RestController
@RefreshScope
public class ProductController {

    @Value("${zzc}")
    private String zzc;

    @GetMapping("/yml")
    public String getYml(){
        return zzc;
    }
}
