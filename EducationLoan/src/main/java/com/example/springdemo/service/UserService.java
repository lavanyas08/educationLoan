package com.example.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.springdemo.model.UserModel;
import com.example.springdemo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;

	public UserModel postUser(UserModel u) {
		// TODO Auto-generated method 
		return repo.save(u);
	}

	public List<UserModel> getyAllDetails() {
		// TODO Auto-generated method stub
		List<UserModel> li=repo.findAll();
		return li;
	}

	public UserModel saveDetails(UserModel s,int rno) {
		// TODO Auto-generated method stub
		Optional<UserModel> optional= repo.findById(rno);
		UserModel obj=null;
		if(optional.isPresent())
		{
			/*obj=optional.get();
			obj.setRegno(s.getRegno());
			obj.setName(s.getName());
			obj.setDep(s.getDep());
			obj.setEmail(s.getEmail());*/
			repo.saveAndFlush(s);
		}
		return obj;
	}

	public boolean deleteUser(int regno) {
		boolean result=false;
		repo.deleteById(regno);
		Optional<UserModel> s= repo.findById(regno);
		if(s.isEmpty())
		{
			result=true;
		}
		return result;
	}

	public UserModel getUser(int regno) {
		UserModel s=repo.findById(regno).get();
		return s;
	}

	

}
