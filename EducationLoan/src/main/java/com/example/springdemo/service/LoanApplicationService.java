package com.example.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.LoanApplicationModel;
import com.example.springdemo.repository.LoanApplication;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplication repo;

	public LoanApplicationModel postLoanApp(LoanApplicationModel u) {
		// TODO Auto-generated method stub
		return repo.save(u);
	}
//
	public List<LoanApplicationModel> getyAllDetails() {
		// TODO Auto-generated method stub
		List<LoanApplicationModel> li=repo.findAll();
		return li;
	}
	
	public LoanApplicationModel updateLoanDetails(LoanApplicationModel s,int rno) {
		// TODO Auto-generated method stub
		Optional<LoanApplicationModel> op=repo.findById(rno);
		LoanApplicationModel obj=null;
		if(op.isPresent()) {
			obj =op.get();
			obj.setLoantype(s.getLoantype());
			obj.setApplicantname(s.getApplicantname());
			obj.setApplicantaddress(s.getApplicantaddress());
			obj.setApplicantmobile(s.getApplicantmobile());
			obj.setApplicantemail(s.getApplicantemail());
			obj.setApplicantaadhaar(s.getApplicantaadhaar());
			obj.setApplicantpan(s.getApplicantpan());
			obj.setApplicantsalary(s.getApplicantsalary());
			obj.setLoanamountrequired(s.getLoanamountrequired());
			obj.setLoanrepaymentmonths(s.getLoanrepaymentmonths());
			repo.saveAndFlush(s);
		}
		return obj;
	}


	public boolean  deleteLoanDetails(int regno) {
		// TODO Auto-generated method stub
		boolean result=false;
		repo.deleteById(regno);
		Optional<LoanApplicationModel> s= repo.findById(regno);
		if(s.isEmpty())
		{
			result=true;
		}
		return result;
		
	}

	public LoanApplicationModel getLoanDet(int regno) {		// TODO Auto-generated method stub
		LoanApplicationModel s=repo.findById(regno).get();
		return s;
	}


}
