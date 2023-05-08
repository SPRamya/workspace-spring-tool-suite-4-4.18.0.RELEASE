package com.example.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class application {
@Id
private int number;
	private String loanId;
	public String getLoanId() {
	return loanId;
}
public void setLoanId(String loanId) {
	this.loanId = loanId;
}
public String getLoantype() {
	return loantype;
}
public void setLoantype(String loantype) {
	this.loantype = loantype;
}
public String getApplicantName() {
	return applicantName;
}
public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
}
public String getApplicantAddress() {
	return applicantAddress;
}
public void setApplicantAddress(String applicantAddress) {
	this.applicantAddress = applicantAddress;
}
public String getApplicantMobile() {
	return applicantMobile;
}
public void setApplicantMobile(String applicantMobile) {
	this.applicantMobile = applicantMobile;
}
public String getApplicantEmail() {
	return applicantEmail;
}
public void setApplicantEmail(String applicantEmail) {
	this.applicantEmail = applicantEmail;
}
public String getApplicantAadhar() {
	return applicantAadhar;
}
public void setApplicantAadhar(String applicantAadhar) {
	this.applicantAadhar = applicantAadhar;
}
public String getApplicantPan() {
	return applicantPan;
}
public void setApplicantPan(String applicantPan) {
	this.applicantPan = applicantPan;
}
public String getApplicantSalary() {
	return applicantSalary;
}
public void setApplicantSalary(String applicantSalary) {
	this.applicantSalary = applicantSalary;
}
public String getLoanAmountRequired() {
	return loanAmountRequired;
}
public void setLoanAmountRequired(String loanAmountRequired) {
	this.loanAmountRequired = loanAmountRequired;
}
public String getLoanRepaymentMonths() {
	return loanRepaymentMonths;
}
public void setLoanRepaymentMonths(String loanRepaymentMonths) {
	this.loanRepaymentMonths = loanRepaymentMonths;
}
	
	public application() {
	
	// TODO Auto-generated constructor stub
}
	public application(String loanId, String loantype, String applicantName, String applicantAddress,
			String applicantMobile, String applicantEmail, String applicantAadhar, String applicantPan,
			String applicantSalary, String loanAmountRequired, String loanRepaymentMonths) {
		super();
		this.loanId = loanId;
		this.loantype = loantype;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.applicantMobile = applicantMobile;
		this.applicantEmail = applicantEmail;
		this.applicantAadhar = applicantAadhar;
		this.applicantPan = applicantPan;
		this.applicantSalary = applicantSalary;
		this.loanAmountRequired = loanAmountRequired;
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	private String loantype;
	private String applicantName;
	private String applicantAddress;
	private String applicantMobile;
	private String applicantEmail;
	private String applicantAadhar;
	private String applicantPan;
	private String applicantSalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	
}
