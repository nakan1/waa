package com.sc.carrental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sc.carrental.domain.UserRoles;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRoles, Integer> {
	
}
