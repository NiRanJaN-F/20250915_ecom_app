package com.example.demoSpring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller // Correct annotation to return views
public class WebController {

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("pageTitle", "Welcome to My E-Commerce App");
        model.addAttribute("user", "John");
        return "home"; // This refers to home.html in /templates/
    }

    @GetMapping("/data")
    @ResponseBody
    public String getData() {
        return "This is JSON data";
    }
}
