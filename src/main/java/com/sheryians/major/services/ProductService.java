package com.sheryians.major.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.Model.Product;
import com.sheryians.major.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProducts(){	return productRepo.findAll();}
	public void addProduct(Product product) { productRepo.save(product);}   
	public void deleteProductById(long id) {  productRepo.deleteById(id);}
    public List<Product> getAllProductsByCategoryId(int id){
    	return productRepo.findAllByCategory_id(id);
    }
    
    public Optional<Product> getProductById(long id){
    	return productRepo.findById(id);
    }
	
}
