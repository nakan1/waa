package com.sc.carrental.repository;

import java.util.List;

import com.sc.carrental.domain.Category;


public interface CatgeoryRepository {
	public List<Category> getAllCategory();
	public Category getCategoryById(String Id);
	

}
