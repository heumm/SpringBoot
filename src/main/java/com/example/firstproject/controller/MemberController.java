package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {


    @GetMapping("/member/signin")
    public String signIn() {
        return "";
    }

    @PostMapping("/member/signup")
    public String signUp() {
        return "";
    }
}
