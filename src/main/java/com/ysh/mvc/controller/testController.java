package com.ysh.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    /*@RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
