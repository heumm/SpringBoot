package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {


    @GetMapping("/member/signin")
    public String signIn() {
        return "";
    }


    @GetMapping("/member/signup")
    public String signUpForm() {
        return "members/signup";
    }

    @PostMapping("member/create")
    public String createUser(MemberForm form) {
        Member member = form.toEntity();
        return "/";
    }

}
