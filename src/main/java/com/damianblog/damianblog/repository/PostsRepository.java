package com.damianblog.damianblog.repository;

import com.damianblog.damianblog.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer> {

}
