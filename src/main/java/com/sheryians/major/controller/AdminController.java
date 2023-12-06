package com.sheryians.major.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sheryians.major.model.Categories;
import com.sheryians.major.services.CatService;
import com.sheryians.major.services.ProductService;

@Controller
public class AdminController {
	
	@Autowired
	CatService cs;
	
	@Autowired
	ProductService ps;
	
	
	@GetMapping("/admin")
	public String adminHome() {
		return "adminHome";
	}

	
	@GetMapping("/admin/categories")
	public String getCat(Model model) {
		model.addAttribute("categories", cs.getAll());
		return "categories";
	}
	@GetMapping("/admin/categories/add")
	public String getaddCat(Model model) {
		model.addAttribute("category", new Categories());
		return "categoriesAdd";
		
	}
	
	@PostMapping("/admin/categories/add")
	public String postaddCat(@ModelAttribute("category") Categories cat ) {
	    cs.addCat(cat);
	    return  "redirect:/admin/categories" ;
	}
	
	@GetMapping("/admin/categories/delete/{id}")
	public String deleteCat(@PathVariable int id) {
		cs.deleteCatById(id);
		return "redirect:/admin/categories";
		
	}
	
	@GetMapping("admin/categories/update/{id}")
	public String updateCat(@PathVariable int id , Model model) {
		Optional<Categories> cat= cs.getCat(id);
		if(cat.isPresent()) {
			model.addAttribute("category" , cat.get());
			return "categoriesAdd";
		}
		else {
			return "404";
		}
		
	}
	    
	
}
