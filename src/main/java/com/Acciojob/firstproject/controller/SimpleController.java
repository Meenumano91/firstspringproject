package com.Acciojob.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleController {

    @GetMapping("/simple1")
    public String getsimple1()
    {
        return "This is simple1 API";
    }

    @GetMapping("/simple2")
    public String getsimple2()
    {
        return "This is simple2 API";
    }

}
