package com.rnj.ddangily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome() {

        System.out.println("hihi");

        return "index";
    }


}

