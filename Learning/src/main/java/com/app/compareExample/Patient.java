package com.app.compareExample;

public class Patient  {
	
	private int patientID;
	private String firstName;
	private String lastName;
	
	public Patient(int patientID, String firstName, String lastName) {
		//super();
		this.patientID = patientID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
