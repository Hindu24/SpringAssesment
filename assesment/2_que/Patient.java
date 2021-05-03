package com.org;

public class Patient {
	private int patientId ;
	private String patientName ;
	private   double patientHeight;
	private double patientWeight ;
	public void getPatientId() {
		System.out.println("Patient ID  is ---"+patientId);
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public void getPatientName() {
		System.out.println("Patient name is ---"+patientName);
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public void getPatientHeight() {
		System.out.println("Patient weight  is ---"+patientHeight);
	}
	public void setPatientHeight(double patientHeight) {
		this.patientHeight = patientHeight;
	}
	public void getPatientWeight() {
		System.out.println("Patient weight is ---"+patientWeight);
	}
	public void setPatientWeight(double patientWeight) {
		this.patientWeight = patientWeight;
	}
	
}
