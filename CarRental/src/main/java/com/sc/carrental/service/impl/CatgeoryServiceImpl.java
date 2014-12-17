package com.sc.carrental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.carrental.domain.Category;
import com.sc.carrental.repository.CatgeoryRepository;
import com.sc.carrental.service.CategoryService;

@Service
public class CatgeoryServiceImpl implements CategoryService {

	@Autowired
	private CatgeoryRepository catgeoryDAO;
	
	public List<Category> getAllCategory()
	{
		return catgeoryDAO.getAllCategory();
	}
	
	public Category getCategoryById(String Id)
	{
		return catgeoryDAO.getCategoryById(Id);
	}
	

}
