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

import com.example.springdemo.model.LoanApplicationModel;

import com.example.springdemo.service.LoanApplicationService;

@RestController
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationService service;
	@PostMapping("/postLoanApp")
	public LoanApplicationModel postLoanApp(@RequestBody LoanApplicationModel u)
	{
		return service.postLoanApp(u);
	}
	@GetMapping(value="fetchLoanDetails")
	public List<LoanApplicationModel> getAllDetails() {
		return service.getyAllDetails();
		}
	@PutMapping(value="/updateLoanDetails/{rno}")
	 public LoanApplicationModel updateLoanDetails(@RequestBody LoanApplicationModel s,@PathVariable int rno) 
	{
		return service.updateLoanDetails(s,rno);
			
	}
	 @DeleteMapping(value="/deleteLoanDetails/{rno}") 
	 public void  deleteLoanDetails(@PathVariable("rno") int regno)
	 {
	 	service.deleteLoanDetails(regno);
	 }
	 @GetMapping(value="/getLoanDet/{rno}")
	 public LoanApplicationModel getLoanDet(@PathVariable("rno")  int regno)
	 {
	 	return service.getLoanDet(regno);
	 }

}
