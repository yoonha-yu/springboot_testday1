package com.std.sbb_1.Article;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "article")
@Entity
@Getter
@Setter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 700)
    private String content;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    public Article(String title, String content, LocalDateTime createdDate){
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;

    }
}
