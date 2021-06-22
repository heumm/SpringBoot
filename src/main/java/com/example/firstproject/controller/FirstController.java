package com.example.firstproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@Slf4j
public class FirstController {

    @GetMapping("/home")
    public String home() {
        log.info("home controller home()메소드 호출!");
        return "";
    }


//    @GetMapping("/hi")
//    public String niceToMeetyou(Model model) {
//        model.addAttribute("username", "한흠");
//        return "greetings";
//    }
//
//    @GetMapping("/bye")
//    public String seeYouNext(Model model) {
//        model.addAttribute("nickname", "조한흠");
//        return "goodBye";
//    }
}
