package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j  //로깅을 위한 어노테이션
public class ArticleController {

    @Autowired //스프링 부트가 미리 생성해놓은 객체를 가져와 자동으로 연결
    private ArticleRepository articleRepository;

    @GetMapping("/board")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/create")
    @ResponseBody
    public String createArticle(@RequestBody ArticleForm form) {
        log.info(form.toString());
//        System.out.println(form.toString()); -> 로깅으로 대체

        //1. Dto를 Entity로 변환
        Article article = form.toEntity();
        log.info(article.toString());
//        System.out.println(article.toString()); -> 로깅으로 대체
       //2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        Map<String, Object> result = new HashMap<>();
        result.put("article", saved);
        log.info(saved.toString());
//        System.out.println(saved.toString()); -> 로깅으로 대체

        return new Gson().toJson(result);
    }

    @GetMapping("/articles/list")
    public String showArticles() {
        return "articles/list";
    }


}
