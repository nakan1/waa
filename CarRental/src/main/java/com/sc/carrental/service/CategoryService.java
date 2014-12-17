package com.sc.carrental.service;

import java.util.List;

import com.sc.carrental.domain.Category;


public interface CategoryService {
	
	public List<Category> getAllCategory();
	public Category getCategoryById(String Id);
	

}
