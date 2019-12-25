package com.wjt.springboot_2019_12_23.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends RuntimeException{
    private String code;
    private String msg;
}
