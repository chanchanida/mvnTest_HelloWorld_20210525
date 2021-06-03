package com.mythtest.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/indexing")
    public String indexing(){
        return "Welcomeeeeeeeeeeeee Index!";
    }
}
