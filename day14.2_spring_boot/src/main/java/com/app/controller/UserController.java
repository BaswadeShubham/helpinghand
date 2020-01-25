package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User1;
import com.app.service.IUserService;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*")
@RestController
//@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}
	
	/*
	 * @GetMapping("/login") public String showLoginForm() {
	 * System.out.println("in login form"); return "/user/login"; }
	 */
	
	/*
	 * @RequestMapping(method=RequestMethod.POST,path="/login") public
	 * ResponseEntity<?> PerformLogin(@RequestBody User1 u1){
	 * System.out.println(u1); String email= u1.getEmail(); String
	 * pass=u1.getPassword(); User1 u = service.authenticationService(email, pass);
	 * if(u != null) { return new ResponseEntity<User1>(u, HttpStatus.OK); }
	 * 
	 * return new
	 * ResponseEntity<String>("Authentication failed: invalid credentials",
	 * HttpStatus.OK); }
	 */
	
	@RequestMapping(method=RequestMethod.POST,path="/login")
	public boolean PerformLogin(@RequestBody User1 u1){
		System.out.println(u1);
		String email= u1.getEmail();
		String pass=u1.getPassword();   
		User1 u = service.authenticationService(email, pass);
		if(u != null)
		{
			return true; 
		}
		
		return false;
	}
	
	
	
}
