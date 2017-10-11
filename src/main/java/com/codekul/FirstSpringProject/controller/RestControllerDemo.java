package com.codekul.FirstSpringProject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pooja on 11/10/17.
 */
@RestController
@RequestMapping(value = "/demo")
public class RestControllerDemo {

    @RequestMapping(value = "/add/{a}/{b}")
    Integer add(@PathVariable Integer a,@PathVariable Integer b){
        Integer c=a+b;
        return c;
    }
}
