package com.sc.carrental.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sc.carrental.domain.Category;
import com.sc.carrental.repository.CatgeoryRepository;



public class CatgeoryDAOImpl implements CatgeoryRepository{
	public List<Category> getAllCategory()
	{
		List<Category> categories=new ArrayList<Category>();
		return categories;
	}
	public Category getCategoryById(String Id)
	{
		Category category=new Category(1,"Truck");
		return category;
	}

}
