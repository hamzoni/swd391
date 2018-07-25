package com.fpt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.entity.Users;
import com.fpt.service.UserService;

/**
 * 
 * @author TungLT25
 * @date Jul 12, 2018
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Users>> getAllUser() {
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseEntity<Users> login(@RequestParam(value = "username") String user,
			@RequestParam(value = "password") String password) {
		return new ResponseEntity<>(userService.login(user, password), HttpStatus.OK);
	}

	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public ResponseEntity<Users> login2(@RequestBody Users user) {
		return new ResponseEntity<>(userService.login(user.getUsername(), user.getPassword()), HttpStatus.OK);
	}
}