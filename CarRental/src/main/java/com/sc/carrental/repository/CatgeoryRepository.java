package com.sc.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sc.carrental.domain.Category;

@Repository
public interface CatgeoryRepository extends CrudRepository<Category, Integer>{
	
	

}
