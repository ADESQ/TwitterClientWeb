package com.adesq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    @RequestMapping("/{message}")
    public String helloWorld(@PathVariable (value = "message", name = "message") String message, Model model) {
        model.addAttribute("message", message);
        return "helloWorld";
    }
}
