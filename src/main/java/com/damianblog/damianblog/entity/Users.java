package com.damianblog.damianblog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password; // kodowanie

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @OneToMany(mappedBy = "user")
    private List<Posts> posts;

    public Users(String email, String password, String role, String name, String surname){
        this.email = email;
        this.password = password;
        this.role = role;
        this.name = name;
        this.surname = surname;
    }
}