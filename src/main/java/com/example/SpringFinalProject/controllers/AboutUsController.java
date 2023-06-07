package com.example.SpringFinalProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/about_us")
public class AboutUsController {
    @GetMapping
    public String getMainPage(){
        return "about_us";
    }
}
