package com.sheryians.major.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheryians.major.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product ,Long>{

	List<Product> findAllByCategory_id(int id);

	void deleteById(long id);
	

}
