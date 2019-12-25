package com.wjt.springboot_2019_12_23;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

@SpringBootTest
/*@ContextConfiguration(locations = "classpath:applicationContext.xml")
@ExtendWith(SpringExtension.class)*/
public class test {
    @Autowired
    Date myDate;

    @Test
    public void myDate(){
        System.out.println(myDate);
    }
}
