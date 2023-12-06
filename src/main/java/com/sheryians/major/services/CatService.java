package com.sheryians.major.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.model.Categories;
import com.sheryians.major.repository.CatRepository;

@Service
public class CatService {
	
	@Autowired
	CatRepository cr;
	
	public List<Categories> getAll(){
		return cr.findAll();
	}
	public void addCat(Categories cat) {
		cr.save(cat);
	}
	
	public void deleteCatById(int id) {
		cr.deleteById(id);
	}
    
	public Optional<Categories> getCat(int id){
		return cr.findById(id);
	}
}
