package com.Acciojob.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/demo1")
    public String getDemo1()
    {
        System.out.println("This is our first demo");
        return "This is our first demo API";
    }

    @GetMapping("/demo2")
    public String getDemo2()
    {
        return "This is demo2 API";
    }
}
