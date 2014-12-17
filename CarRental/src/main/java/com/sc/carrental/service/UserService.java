package com.sc.carrental.service;

import java.util.Collection;
import java.util.List;





import com.sc.carrental.domain.User;


public interface UserService {
	 List<User> findAll();
	 User getUserByUsername(String username);
	 void saveUser(User user);
	
}
