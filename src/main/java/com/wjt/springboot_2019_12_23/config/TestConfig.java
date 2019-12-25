package com.wjt.springboot_2019_12_23.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class TestConfig {

    @Bean
    public Date getDate(){
        return new Date();
    }
}
