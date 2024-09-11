package com.std.sbb_1.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseEntity<Article> createdArticle(@RequestParam String title, @RequestParam String content){
        Article article = articleService.createArticle(title,content);
        return new ResponseEntity<>(article, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Article>> getAllArticles(){
        List<Article> articles = articleService.createArticle(title, content);
        return new ResponseEntity<>(articles, HttpStatus.CREATED);
    }
}
