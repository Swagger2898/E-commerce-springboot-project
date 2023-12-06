package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.model.Categories;

public interface CatRepository extends JpaRepository<Categories,Integer> {

}
