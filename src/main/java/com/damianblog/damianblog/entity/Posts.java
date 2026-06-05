package com.damianblog.damianblog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content; // markdown

    @Column(nullable = false, unique = true)
    private String slug; // generowany automatycznie po tytule

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private int likes; // 0 domyslnie

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    public Posts(String title, String content){
        this.title = title;
        this.content = content;
    }

    // metoda wykona sie przed zapisem do bazy (postRepository.save(post))
    @PrePersist
    private void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.slug = this.generateSlug(this.title);
    }

    private String generateSlug(String title){
        // tutaj musze wygenerowac slug
        return "";
    }
}
