package com.portfolio.community.controller;

import com.portfolio.community.dto.ArticleForm;
import com.portfolio.community.entitiy.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        // 앞으로 할 작업
        // 1. DTO를 entitiy로 변환
        // 2. Repository로 entitiy를 DB에 저장
            Article article = form.toEntity();

        return " "; // 데이터는 콘솔에 찍히지만, 404만 찍힌다.(메소드 자체가 있든 없든)
    }
}
