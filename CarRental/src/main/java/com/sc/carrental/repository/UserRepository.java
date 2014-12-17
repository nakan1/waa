package com.sc.carrental.repository;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sc.carrental.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
	 @Query("SELECT u FROM User u")
	 List<User> findAll();
	// List<User> getAllUser();
	// User getByUsername(String username);
}
