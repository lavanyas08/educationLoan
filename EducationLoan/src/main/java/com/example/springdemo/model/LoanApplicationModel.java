package com.example.springdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class LoanApplicationModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="loanid")
	private int loanid;
	@Column(name="loantype")
	private String loantype;
	@Column(name="applicantname")
	private String applicantname;
	@Column(name="applicantaddress")
	private String applicantaddress;
	@Column(name="appicantmobile")
	private String applicantmobile;
	@Column(name="applicantemail")
	private String applicantemail;
	@Column(name="applicantaadhaar")
	private String applicantaadhaar;
	@Column(name="applicantpan")
	private String applicantpan;
	@Column(name="applicantsalary")
	private String applicantsalary;
	@Column(name="loanamountrequired")
	private String loanamountrequired;
	@Column(name="loanrepaymentmonths")
	private String loanrepaymentmonths;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public String getApplicantaddress() {
		return applicantaddress;
	}
	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}
	public String getApplicantmobile() {
		return applicantmobile;
	}
	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}
	public String getApplicantemail() {
		return applicantemail;
	}
	public void setApplicantemail(String applicantemail) {
		this.applicantemail = applicantemail;
	}
	public String getApplicantaadhaar() {
		return applicantaadhaar;
	}
	public void setApplicantaadhaar(String applicantaadhaar) {
		this.applicantaadhaar = applicantaadhaar;
	}
	public String getApplicantpan() {
		return applicantpan;
	}
	public void setApplicantpan(String applicantpan) {
		this.applicantpan = applicantpan;
	}
	public String getApplicantsalary() {
		return applicantsalary;
	}
	public void setApplicantsalary(String applicantsalary) {
		this.applicantsalary = applicantsalary;
	}
	public String getLoanamountrequired() {
		return loanamountrequired;
	}
	public void setLoanamountrequired(String loanamountrequired) {
		this.loanamountrequired = loanamountrequired;
	}
	public String getLoanrepaymentmonths() {
		return loanrepaymentmonths;
	}
	public void setLoanrepaymentmonths(String loanrepaymentmonths) {
		this.loanrepaymentmonths = loanrepaymentmonths;
	}

}
