package com.app.compareExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Patient> patientList=new ArrayList<>();
		patientList.add(new Patient(23, "Hari", "Das"));
		patientList.add(new Patient(26, "Anu", "K"));
		patientList.add(new Patient(21, "Venu", "Shree"));
		patientList.add(new Patient(15, "Kasi", "Ram"));
		System.out.println("Before sort");
		for(Patient p:patientList)
		{
			System.out.println(p.getPatientID()+"  "+p.getFirstName()+"  "+p.getLastName());
		}
		Collections.sort(patientList,Comparator.comparing(Patient::getFirstName));
		System.out.println("After sort");
		for(Patient p:patientList)
		{
			System.out.println(p.getPatientID()+"  "+p.getFirstName()+"  "+p.getLastName());
		}
	}

}
