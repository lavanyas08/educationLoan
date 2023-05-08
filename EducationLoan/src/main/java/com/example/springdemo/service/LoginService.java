package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.LoginModel;
import com.example.springdemo.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository repo;

	public LoginModel login(LoginModel l) {
		// TODO Auto-generated method stub
		LoginModel obj=repo.save(l);
		return obj;
	}

	public List<LoginModel> getLogin() {
		// TODO Auto-generated method stub
		List<LoginModel> li=repo.findAll();
		return li;
	}

}
