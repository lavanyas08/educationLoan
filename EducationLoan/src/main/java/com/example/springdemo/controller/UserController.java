package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.UserModel;
import com.example.springdemo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/postUser")
	public UserModel postUser(@RequestBody UserModel u)
	{
		return service.postUser(u);
	}
	@GetMapping(value="fetchDetails")
	public List<UserModel> getAllDetails() {
		List<UserModel> li=service.getyAllDetails();
		return li;
	}
	@PutMapping(value="/updateStudent/{rno}")
	 public UserModel updateDetails(@RequestBody UserModel s,@PathVariable int rno) 
	{
		return service.postUser(s);
			
	}
	 @DeleteMapping(value="/deleteUser/{rno}") 
	 public void  deleteUser(@PathVariable("rno") int regno)
	 {
	 	service.deleteUser(regno);
	 }
	 @GetMapping(value="/getUser/{rno}")
	 public UserModel getUser(@PathVariable("rno")  int regno)
	 {
	 	return service.getUser(regno);
	 }
	
	

}
