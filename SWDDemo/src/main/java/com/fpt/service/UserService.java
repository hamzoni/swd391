package com.fpt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.entity.Users;
import com.fpt.repository.UserRepository;

/**
 * 
 * @author TungLT25
 * @date Jul 12, 2018
 */

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<Users> getAllUser(){
		return userRepo.findAll();
	}
	
}
