package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.LoginModel;
import com.example.springdemo.service.LoginService;

@CrossOrigin
@RestController
public class LoginController {
	@Autowired
	LoginService service;
	
	@PostMapping("/login")
	public LoginModel login(@RequestBody LoginModel l) {
		return service.login(l);
	}
	
	@GetMapping("/getLogin")
	public List<LoginModel> getLogin(){
		List<LoginModel> li=service.getLogin();
		return li;
	}

}
