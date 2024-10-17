package com.portfolio.community.controller;

import com.portfolio.community.dto.ArticleForm;
//import com.portfolio.community.entitiy.Article;
//import com.portfolio.community.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;


@Slf4j
@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해 놓은 객체, 의존성 주입


    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
        // 앞으로 할 작업
        // 1. DTO를 entitiy로 변환
        // 2. Repository로 entitiy를 DB에 저장
//            Article article = form.toEntity();
//            log.info(article.toString());
//
//            Article saved = articleRepository.save(article);
//            log.info(saved.toString());

          return "redirect:/articles/";
        //return "redirect:/articles";
    }

}
