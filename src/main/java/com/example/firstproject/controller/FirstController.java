package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetyou(Model model) {
        model.addAttribute("username", "한흠");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "조한흠");
        return "goodBye";
    }
}
