package com.Acciojob.firstproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/sample/apis")

public class SampleController {

    @GetMapping("/sample1")
    public String getsample1()
    {
        return "This is sample1 API";
    }

    @GetMapping("/sample2")
    public String getsample2()
    {
        return "This is sample2 API";
    }

}
