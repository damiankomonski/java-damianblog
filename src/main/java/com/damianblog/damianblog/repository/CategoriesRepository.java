package com.damianblog.damianblog.repository;

import com.damianblog.damianblog.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
