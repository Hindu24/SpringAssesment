package com.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.Patient;


public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		Patient p = (Patient) app.getBean("pat");
		p.getPatientId();
		p.getPatientHeight();
		p.getPatientName();
		p.getPatientWeight();
	}
	}
		
