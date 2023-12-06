package com.sheryians.major.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sheryians.major.model.Product;
import com.sheryians.major.repository.ProductRepo;

@Service
public class ProductService {

	
	@Autowired
	ProductRepo pr;
	
	public List<Product> getAllProd(){
		return pr.findAll();
	}
	public void addProd(Product prod) {
		pr.save(prod);
	}
	
	public void deleteProdById(int id) {
		pr.deleteById(id);
	}
    
	public Optional<Product> getProd(int id){
		return pr.findById(id);
	}
	
}
