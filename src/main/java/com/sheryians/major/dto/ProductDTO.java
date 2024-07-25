package com.sheryians.major.dto;



import lombok.Data;

@Data
public class ProductDTO {
	
	private long id ;
	private String name ;
	private int categoryId;
	//private int category;   // --> this wont work as the key provided in the thymeleaf is categoryId
	
	private double price ;
	private double weight;
	
	private String description ;
	private String imageName;
	

}
