package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheryians.major.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
