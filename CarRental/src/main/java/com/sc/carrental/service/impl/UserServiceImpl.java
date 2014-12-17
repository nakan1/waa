package com.sc.carrental.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sc.carrental.domain.User;
import com.sc.carrental.repository.UserRepository;
import com.sc.carrental.service.UserService;



@Service
@Transactional
@Resource(name="1")
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {

		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepository.findOne(username);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	


}
