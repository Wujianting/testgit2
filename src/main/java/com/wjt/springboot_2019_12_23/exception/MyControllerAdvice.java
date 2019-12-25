package com.wjt.springboot_2019_12_23.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/*@RestControllerAdvice*/
@ControllerAdvice
public class MyControllerAdvice {
    /*@ExceptionHandler(value = Exception.class)
    public Map<String,Object> errorHandler(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg",e.getMessage());
        return map;
    }*/

    @ExceptionHandler(value=BusinessException.class)
    public Map<String,Object> errorHandler(BusinessException e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMsg());
        return map;
    }
    @ExceptionHandler(value = RuntimeException.class)
    public String errorHandler(RuntimeException e){
        return "error500";
    }
}
