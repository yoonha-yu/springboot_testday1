package com.std.sbb_1.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Article createArticle(String title, String content){
        Article article = new Article(title, content, LocalDateTime.now());
        return ArticleRepository.save(article);
    }
    public List<Article> getAllArticles(){
        return  articleRepository.findAll();
    }
    public Optional<Article> getArticleById(Integer id) {
        return articleRepository.findById(id);
    }
    public Article updateArticle (Integer id, String title, String content) {
        Optional<Article> optionalArticle = ArticleRepository.findById(id);
        if (optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            article.setTitle(title);
            article.setContent(content);
            return articleRepository.save(article);
        }
        return null;
}
public void deletedArticle(Integer id) {
    ArticleRepository.deletedById(id);
    }
}
