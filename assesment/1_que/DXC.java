package com.org;

public class DXC {
	private int DXCId;  
	private String DXCName;  
	private String emailId;
	private Long contactNo;
	
	
	
	public int getDXCId() {
		return DXCId;
	}


	public void setDXCId(int dXCId) {
		DXCId = dXCId;
	}


	public String getDXCName() {
		return DXCName;
	}


	public void setDXCName(String dXCName) {
		DXCName = dXCName;
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


	
	
	public DXC( int DXCId,String DXCName,String emailId,Long contactNo) {  
	    this.DXCId = DXCId;  
	    this.DXCName = DXCName;
	    this.emailId = emailId; 
	    this.contactNo = contactNo; 
	}  
	void show1(){  
	    System.out.println(DXCId +" "+DXCName+" "+emailId+" "+contactNo);  
	}  
	
	
}