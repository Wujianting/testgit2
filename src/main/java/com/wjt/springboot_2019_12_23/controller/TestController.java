package com.wjt.springboot_2019_12_23.controller;

import com.wjt.springboot_2019_12_23.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String test(){
        if(true){
            throw new BusinessException("500","自定义异常500");
            /*throw new RuntimeException();*/
        }
        return "index";
    }
}
