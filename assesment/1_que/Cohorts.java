package com.org;

public class Cohorts {
	private int CohortId;  
	private String CohortName;  
	private String emailId;
	private Long contactNo;
	
	
	public int getCohortId() {
		return CohortId;
	}
	public void setCohortId(int cohortId) {
		CohortId = cohortId;
	}
	public String getCohortName() {
		return CohortName;
	}
	public void setCohortName(String cohortName) {
		CohortName = cohortName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public Cohorts( int CohortId,String CohortName,String emailId,Long contactNo) {  
	    this.CohortId = CohortId;  
	    this.CohortName = CohortName;
	    this.emailId = emailId; 
	    this.contactNo = contactNo; 
	}  
	void show(){  
	    System.out.println(CohortId +" "+CohortName+" "+emailId+" "+contactNo);  
	}  
	
	
}